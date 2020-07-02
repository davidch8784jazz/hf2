package co.kr.hatchfly.hf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableAspectJAutoProxy
@SpringBootApplication
public class HfApplication {

	public static void main(String[] args) {
		SpringApplication.run(HfApplication.class, args);
	}

	/*@Bean
	public InternalResourceViewResolver setupViewResolver() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}*/
}
