package Team1.Eggeul.Service;


import Team1.Eggeul.domain.AdminBoardPageDTO;
import Team1.Eggeul.domain.AdminGroupCriteria;
import Team1.Eggeul.domain.BoardCriteria;
import Team1.Eggeul.domain.BoardVO;
import Team1.Eggeul.service.AdminGroupService;
import Team1.Eggeul.service.BoardService;
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
public class AdminBoardServiceTest {

    @Setter(onMethod_ = {@Autowired})
    private BoardService service;

    @Setter(onMethod_ = {@Autowired})
    private AdminGroupService adminGroupService;

    @Test
    public void testAdminGroupGetListWithPaging(){
        adminGroupService.adminGetGroupListWithPagingBySn(
                new AdminGroupCriteria(1,10)
        );
    }
//    @Test
//    public void testAdminGetListWithPagingBySn(){
//        service.adminGetListWithPagingBySn(new BoardCriteria(3,10))
//                .forEach(board -> log.info(board));
//    }
//    @Test
//    public void testAdminGetListWithPagingBySn(){
//        BoardCriteria cri = new BoardCriteria();
//        cri.setPageNum(2);
//        cri.setAmount(10);
//
//        log.info(service.adminGetListWithPagingBySn(cri));
//
//    }

}
