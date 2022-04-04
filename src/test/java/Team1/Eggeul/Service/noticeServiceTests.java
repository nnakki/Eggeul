package Team1.Eggeul.Service;

import Team1.Eggeul.domain.NoticeVO;
import Team1.Eggeul.domain.StudyCriteria;
import Team1.Eggeul.domain.StudyVO;
import Team1.Eggeul.domain.WishStudyVO;
import Team1.Eggeul.service.NoticeService;
import Team1.Eggeul.service.WishStudyService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
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
public class noticeServiceTests {
    @Setter(onMethod_ = @Autowired)
    private NoticeService service;

    @Test
    public void testRegister() {
        NoticeVO notice=  new NoticeVO();
        notice.setSender("aaaa@naver.com");
        notice.setReceiver("asdf@naver.com");
        notice.setKind("ALST");
        notice.setUrl("study/get?sn=1000");
        notice.setSendDate(new Date());
        notice.setStatus("MSST01");
        notice.setContent("스터디에 참석되셨습니다.");

        String result = "";
        try{
            service.register(notice);
             result = "success";
        }catch (Exception e) {
            result = "error";
        }

        assert ("success".equals(result));
    }

    @Test
    public void testGetList() {
        service.getList("wlgh52725@gmail.com").forEach(notice -> log.info(notice));
        service.getList("wlgh52725@gmail.com").forEach(notice -> {assert ("wlgh52725@gmail.com".equals(notice.getReceiver()));});
    }

    @Test
    public void testModify() {

        String result = "";

        try {
            service.modify(18L);
            result = "success";

        }catch (Exception e) {
            result = "fail";
        }
        assert ("success".equals(result));
    }

}
