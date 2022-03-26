package Team1.Eggeul;

import Team1.Eggeul.mapper.GroupMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.assertj.core.api.Fail.fail;

@Log4j
@SpringBootTest
public class MapperTest {

    @Setter(onMethod_ = @Autowired)
    private GroupMapper groupMapper;

    @Test
    void testGetTime() {
        log.info(groupMapper.getClass().getName());
        log.info(groupMapper.getTime());
    }

}
