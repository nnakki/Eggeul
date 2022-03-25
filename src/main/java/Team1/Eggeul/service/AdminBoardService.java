package Team1.Eggeul.service;

import Team1.Eggeul.domain.AdminBoardCriteria;
import Team1.Eggeul.domain.AdminBoardPageDTO;
import Team1.Eggeul.domain.AdminReplyCriteria;
import Team1.Eggeul.domain.ReplyPageDTO;
import org.apache.ibatis.annotations.Param;

public interface AdminBoardService {

    //------------------------관리자 게시판----------------------------
    AdminBoardPageDTO adminGetListWithPagingBySn(AdminBoardCriteria cri);

    int adminBoardRemove(String sn);

    int adminBoardFromDeleteToActive(String sn);

//    int adminBoardUpdate(BoardVO board);

    //---------------------------관리자 댓글---------------------------
    ReplyPageDTO adminReplyGetListWithPagingBySn(AdminReplyCriteria cri);

    int adminReplyRemove(String sn);

    int adminReplyFromDeleteToActive(String sn);

}
