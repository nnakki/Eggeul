package Team1.Eggeul.security;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Team1.Eggeul.config.RootConfig.class, Team1.Eggeul.config.SecurityConfig.class})
@Log4j
public class datasourceTest {
    @Test
    public void get(){
        System.out.println("asdasdas");
    }
}
