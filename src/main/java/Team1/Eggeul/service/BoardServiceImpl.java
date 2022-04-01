package Team1.Eggeul.service;

import Team1.Eggeul.domain.BoardAttachVO;
import Team1.Eggeul.domain.BoardCriteria;
import Team1.Eggeul.domain.BoardVO;
import Team1.Eggeul.domain.GroupBoardPageDTO;
import Team1.Eggeul.mapper.BoardAttachMapper;
import Team1.Eggeul.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

    private BoardMapper mapper;
    private BoardAttachMapper boardAttachMapper;

    @Override
    public List<BoardVO> getList(long grpSn) {
        return mapper.getList(grpSn);
    }


    @Transactional
    @Override
    public int register(BoardVO board) {

        log.info("board>>>>>>" + board);

        mapper.insertSelectKey(board);

        log.info("method done");
        //두개의 테이블(tbrd(게시판), tbrd_atch(첨부파일))을 동시에 넣기 때문에 transaction사용
        if (board.getAttachList() != null){
            //파일 등록
            board.getAttachList().forEach(attach ->{
                attach.setBrdSn(board.getSn());
                boardAttachMapper.insert(attach);
            });
        }
        return 1;
    }

    @Override
    public BoardVO get(Long sn) {

        log.info("get......" + sn);
        return mapper.read(sn);
    }

    @Transactional
    @Override
    public boolean modify(BoardVO board, Long sn) {
        log.info("modify: " + board);

        //게시판 수정
        //int count1 = mapper.update(board);
        //게시판 내용(content)수정
        //int count2 = mapper.updateContent(board);

        //게시판 최종 수정
        mapper.update(board);

        log.info("업데이트 완료");

        //파일을 수정 할 때 추가된 파일과 삭제된 파일이 있으므로
        // 전체 파일을 삭제시키고 추가된 부분을 insert
        //boardAttachMapper.deleteAll(sn);

        //boolean modifyResult = mapper.update(board) == 1;

        //log.info("modifyResult >>>>>>>>>> "+modifyResult);
//        log.info("첨부파일 유무: " + board.getAttachList());
//        log.info("첨부파일 사이즈: " +board.getAttachList().size());
//
//        if(mapper.update(board) == 1 && board.getAttachList() != null &&
//        board.getAttachList().size() > 0){
//
//            board.getAttachList().forEach(attach ->{
//
//                attach.setBrdSn(board.getSn());
//                boardAttachMapper.insert(attach);
//            });
//        }

        //log.info("첨부파일 처리 완료");

//        mapper.update(board) == 1;

        //return modifyResult;
        return mapper.update(board) == 1;
    }

    //게시판 삭제시 첨부파일도 같이 삭제시켜야함.
    @Transactional
    @Override
    public boolean remove(Long sn) {

        log.info("remove: " + sn);

        boardAttachMapper.deleteAll(sn);

        return mapper.delete(sn) == 1;
    }


//    @Override
//    public List<BoardVO> getListWithPaging(BoardCriteria cri, long grpSn) {
//
//        log.info("get List with BoardCri: " + cri);
//        return mapper.getListWithPaging(cri, grpSn);
//    }

    @Override
    public GroupBoardPageDTO getListWithPaging(BoardCriteria cri, long grpSn){

        log.info("get Board cri :" + cri);

        //getCountBySn 모임안에 게시글의 개수
        return new GroupBoardPageDTO(
                mapper.getCountBySn(grpSn),
                mapper.getListWithPaging(cri, grpSn));
    }


    @Override
    public List<BoardAttachVO> getAttachList(Long brdSn) {

        log.info("get Attach>>>>>>>>>" + brdSn);
        return boardAttachMapper.findByBrdSn(brdSn);
    }

    //현재 사용x(컨트롤러에서 사용안함.)
    @Override
    public int getTotal(BoardCriteria cri) {

        return mapper.getTotalCount(cri);
    }


}
