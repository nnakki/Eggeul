package Team1.Eggeul.Service;

import Team1.Eggeul.domain.GroupCriteria;
import Team1.Eggeul.domain.GroupTagVO;
import Team1.Eggeul.domain.GroupVO;
import Team1.Eggeul.service.GroupTagService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Team1.Eggeul.config.RootConfig.class})
@Log4j
public class GroupTagServiceTests {

    @Setter(onMethod_ = {@Autowired})
    private GroupTagService service;

    @Test
    public void testExist() {
        log.info(service);
        assertNotNull(service);
    }

    @Test
    public void testRegister() {
        List<GroupTagVO> list = new ArrayList<>();
        list.add(new GroupTagVO(224L, "GRTG06"));
        list.add(new GroupTagVO(224L, "GRTG07"));
        list.add(new GroupTagVO(224L, "GRTG08"));

        service.register(list);
    }

    @Test
    public void testGetList() {
        service.getList(224L);
    }

    @Test
    public void testDelete() {
        service.delete(224L);
    }

}
