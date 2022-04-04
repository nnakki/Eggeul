package Team1.Eggeul.Service;

import Team1.Eggeul.domain.ReplyCriteria;
import Team1.Eggeul.domain.ReplyPageDTO;
import Team1.Eggeul.domain.ReplyVO;
import Team1.Eggeul.mapper.ReplyMapper;
import Team1.Eggeul.service.ReplyService;
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
public class AdminReplyServiceTests {

    @Setter(onMethod_ = {@Autowired})
    private ReplyService service;

    @Setter(onMethod_ = {@Autowired})
    private ReplyMapper mapper;


//    @Test
//    public void testAdminGetWithPagingBySn(){
//
//        ReplyCriteria cri = new ReplyCriteria();
//        cri.setPageNum(1);
//        cri.setAmount(10);
//
//        int replyCnt = mapper.getCountBySn();
//
//        ReplyPageDTO list = service.adminGetListWIthPagingBySn(cri);
//
//        log.info(replyCnt);
//        log.info(list);
//    }
}
