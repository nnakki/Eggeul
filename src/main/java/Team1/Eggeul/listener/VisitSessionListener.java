package Team1.Eggeul.listener;

import Team1.Eggeul.util.VisitCountDao;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.sql.DataSource;
import java.util.Date;


//Not used
@Log4j
//@WebListener
public class VisitSessionListener implements HttpSessionListener {

    VisitCountDao dao = VisitCountDao.getInstance();

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("sessionCreated...");

        try {
            se.getSession();


        } catch (Exception e) {
            e.printStackTrace();
        }


        if(se.getSession().isNew()){
            log.info("count...");
            dao.countUp();
        }

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }

}
