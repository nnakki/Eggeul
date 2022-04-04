package Team1.Eggeul.util;

import Team1.Eggeul.domain.MailVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Team1.Eggeul.config.RootConfig.class, Team1.Eggeul.config.SecurityConfig.class})
@Log4j
public class GmailSendTest {

    @Setter(onMethod_ = @Autowired)
    GmailSend gmailSend;

    @Test
    public void test(){
        MailVO vo = new MailVO("tht1234551@gmail.com","테스트중", "");
        try {
            gmailSend.sendAuthMail(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
