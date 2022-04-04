package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.ReplyCriteria;
import Team1.Eggeul.domain.ReplyVO;
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
public class AdminReplyMapperTests {

    @Setter(onMethod_ = @Autowired)
    private ReplyMapper mapper;

    @Test
    public void testAdminGetListWithPagingBySn(){

        ReplyCriteria cri = new ReplyCriteria();
        cri.setAmount(10);
        cri.setPageNum(1);

        List<ReplyVO> list = mapper.adminGetListWithPagingBySn(cri);

        list.forEach(reply -> log.info(list));

    }
}
