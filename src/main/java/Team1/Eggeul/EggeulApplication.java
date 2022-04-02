package Team1.Eggeul;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

//@EnableGlobalMethodSecurity(securedEnabled = true)
@SpringBootApplication
//@MapperScan(basePackages = "Team1")
public class EggeulApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EggeulApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EggeulApplication.class);
	}
}
