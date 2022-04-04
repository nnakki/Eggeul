package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.NoticeVO;
import Team1.Eggeul.domain.StudyCriteria;
import Team1.Eggeul.domain.StudyVO;
import Team1.Eggeul.domain.WishStudyVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Team1.Eggeul.config.RootConfig.class})
@Log4j
public class NoticeMapperTests {

    @Setter(onMethod_ = @Autowired)
    NoticeMapper mapper;

    @Test
    public void testInsert() {
        NoticeVO notice=  new NoticeVO();
        notice.setSender("jiho@naver.com");
        notice.setReceiver("asdf@naver.com");
        notice.setKind("ALST");
        notice.setUrl("study/get?sn=1000");
        notice.setSendDate(new Date());
        notice.setStatus("MSST01");
        notice.setContent("스터디에 참석되셨습니다.");

        assert (mapper.insert(notice) == 1);
    }

    @Test
    public void testGetList() {
        mapper.getList("wlgh52725@gmail.com").forEach(notice -> log.info(notice));
        mapper.getList("wlgh52725@gmail.com").forEach(notice -> {assert ("wlgh52725@gmail.com".equals(notice.getReceiver()));});
    }


    @Test
    public void testUpdate() {
        assert (mapper.update(16L) == 1);
    }

}
