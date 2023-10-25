package tw.hwang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//相當於mvc-servlet.xml的java程式組態的類別
@Configuration
@ComponentScan(basePackages = {"tw.leonchen"})
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver irv1 = new InternalResourceViewResolver();
		irv1.setPrefix("/WEB-INF/pages/");
		irv1.setSuffix(".jsp");
		irv1.setOrder(6);
		return irv1;
	}

}