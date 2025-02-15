package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.AdminUserCriteria;
import Team1.Eggeul.domain.MemberHistoryVO;
import Team1.Eggeul.domain.MemberHistoryVOTests;
import Team1.Eggeul.domain.MemberVO;
import Team1.Eggeul.mapper.MemberMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages={"com.swime.config"})
@ContextConfiguration(classes = {Team1.Eggeul.config.RootConfig.class, Team1.Eggeul.config.SecurityConfig.class})
@Log4j
public class MemberMapperTests {

    @Setter(onMethod_ = @Autowired)
//    @Autowired
    MemberMapper mapper;

    @Setter(onMethod_ = @Autowired)
    PasswordEncoder passwordEncoder;

    @Test
    public void getMapper(){
        log.info(mapper);
        Assert.assertNotNull(mapper);

    }

    @Test
    public void getEncoder(){
        log.info(passwordEncoder);
        Assert.assertNotNull(passwordEncoder);
    }

    @Test
    public void readTest(){
//        MemberVO memberVO = mapper.read("asd123@naver.com");
        MemberVO memberVO = mapper.read("hong2841@service.com");
        Assert.assertNotNull(memberVO);
    }

    @Test
    public void dateFormat(){
//        MemberVO memberVO = mapper.read("asd123@naver.com");
        MemberVO memberVO = mapper.read("qwer2810@naver.com");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");
//        log.info(memberVO.getRegDate());
        String com = "2021/04/95 19:04:00";
//        log.info(simpleDateFormat.format(memberVO.getRegDate()));
        Assert.assertEquals(com, simpleDateFormat.format(memberVO.getRegDate()));
    }

    @Test
    public void insertTest() {
        int random = (int)(Math.random()*10000);
        MemberVO memberVO = new MemberVO();
        memberVO.setId("qwer" + random + "@naver.com");
        memberVO.setName("홍길동" + random);
        memberVO.setPassword("qwer" + random);
        Assert.assertEquals(mapper.insert(memberVO),1);
    }

    @Test
    public void updateTest(){
        int random = (int)(Math.random()*10000);
        MemberVO memberVO = mapper.read("qwer3568@naver.com");
        memberVO.setPassword("updatepassword" + random);
        memberVO.setName("이름변경" + random);
        memberVO.setBirth("2010312");
        memberVO.setLastLoginDate(null);
        memberVO.setEmailAuth(null);
        Assert.assertEquals(mapper.update(memberVO),1);
        log.info(memberVO.getEmailAuth());
    }

    @Test
    public void updateTest2(){
        int random = (int)(Math.random()*10000);
        MemberVO memberVO = mapper.read("qwer3568@naver.com");
        memberVO.setPassword("updatepassword" + random);
        memberVO.setName("이름변경" + random);
        if(memberVO.getLastLoginDate() == null) memberVO.setLastLoginDate(null);
        if(memberVO.getEmailAuth() == null) memberVO.setLastLoginDate(null);
        Assert.assertEquals(mapper.update(memberVO),1);
        log.info(memberVO.getEmailAuth());
    }

    @Test
    public void deleteTest(){
        int random = (int)(Math.random()*10000);
        MemberVO memberVO = new MemberVO();
        memberVO.setId("qwer" + random + "@naver.com");
        memberVO.setName("홍길동" + random);
        memberVO.setPassword("qwer" + random);
        Assert.assertEquals(mapper.insert(memberVO),1);
        Assert.assertEquals(mapper.delete("qwer" + random + "@naver.com"),1);
        Assert.assertNull(mapper.read("qwer" + random + "@naver.com"));
    }

    @Test
    public void getList(){
        mapper.getlist().forEach(log::info);
        Assert.assertNotNull(mapper.getlist());
    }

    @Test
    public void regHist2(){
        MemberHistoryVO vo = new MemberHistoryVO();
        MemberVO memberVO = mapper.read("qwer7044@naver.com");
        vo.setEmail(memberVO.getId());
        vo.setBefVal("asd");
        vo.setAftVal("zxc");
        vo.setUpdMtr("password");
        vo.setDescription("");
        vo.setReason("test01");
        vo.setUpdUserId("qwer7044@naver.com");
        mapper.registerHistory(vo);
    }

    @Test
    public void getHistList(){
        List<MemberHistoryVO> list = mapper.getHistory("qwer7044@naver.com");
        Assert.assertNotNull(list);
        list.forEach(log::info);
    }

    @Test
    public void insertKey(){
        int random = (int)(Math.random()*10000);
        Assert.assertEquals(mapper.insertKey("junit테스트" + random, "sad78ssasd" + random), 1);
    }

    @Test
    public void selectKey(){
        Assert.assertNotNull(mapper.selectKey("junit테스트"));
    }

    @Test
    public void deleteKey(){
        int random = (int)(Math.random()*10000);
        Assert.assertEquals(mapper.insertKey("junit테스트" + random, "sad78ssasd" + random), 1);
        Assert.assertEquals(mapper.deleteKey("junit테스트" + random), 1);
    }

    @Test
    public void selwithauth(){
        MemberVO memberVO = mapper.readWithAuth("aaa123@naver.com");
//        MemberVO memberVO = mapper.readWithAuth("asd123@naver.com");
        log.info(memberVO);
    }

    @Test
    public void realAllUser(){
        List<MemberVO> list = mapper.selectAllMember(new AdminUserCriteria());
        list.forEach(log::info);
    }

    @Test
    public void realAllUserCount(){
        int count = mapper.allMemberCount();
        log.info(count);
    }
}
