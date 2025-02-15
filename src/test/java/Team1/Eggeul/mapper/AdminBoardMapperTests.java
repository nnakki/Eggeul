package Team1.Eggeul.mapper;


import Team1.Eggeul.domain.*;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Team1.Eggeul.config.RootConfig.class})
@Log4j
public class AdminBoardMapperTests {

    @Setter(onMethod_ = @Autowired)
    private AdminBoardMapper mapper;

    @Setter(onMethod_ = @Autowired)
    private AdminGroupMapper groupMapper;

//    @Test
//    public void testAdminGetListWithPagingBySn(){
//        BoardCriteria cri = new BoardCriteria();
//        List<BoardVO> list = mapper.adminGetListWithPagingBySn(cri);
//        list.forEach(board->log.info(board));
//    }
//    @Test
//    public void testAdminGetListWithPagingBySn2(){
//        BoardCriteria cri = new BoardCriteria();
//        cri.setPageNum(2);
//        cri.setAmount(10);
//        List<BoardVO> list = mapper.adminGetListWithPagingBySn(cri);
//
//        list.forEach(board-> log.info(board));
//    }

    @Test
    public void testAdminGetCountBySn(){
        AdminGroupCriteria cri = new AdminGroupCriteria();

        log.info(groupMapper.adminGetCountBySn(cri));
    }

    @Test
    public void teatAdminGetGroupListWithPaging(){
        AdminGroupCriteria cri = new AdminGroupCriteria();
        List<GroupVO> list = groupMapper.adminGetGroupListWithPagingBySn(cri);
        list.forEach(groupMapper -> log.info(groupMapper));
    }


    @Test
    public void testAdminGEtCountBySn(){
        AdminBoardCriteria cri = new AdminBoardCriteria();
        //cri.setActive("D");
        log.info(mapper.adminGetCountBySn(cri));
    }

    @Test
    public void testAdminGetListWithPagingBySnStatus(){
        AdminBoardCriteria cri = new AdminBoardCriteria();
        //cri.setPageNum(1);
        //cri.setAmount(10);
        cri.setType("D");
        cri.setActive("D");
        cri.setKeyword("E");
        cri.setSearch("toyw");
        //cri.setActive("A");
        //cri.setKeyword("삭제");
        List<BoardVO> list = mapper.adminGetListWithPagingBySn(cri);
        list.forEach(board -> log.info(board));
    }

//    @Test
//    public void testAdminGetCount(){
////        AdminBoardCriteria cri = new AdminBoardCriteria();
////        cri.setActive("D");
////        cri.setActive("");
//        int count = mapper.adminGetCountBySn();
//        log.info(count);
//    }



}
