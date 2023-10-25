package tw.hwang.config;

import org.apache.tomcat.util.descriptor.web.FilterDef;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.Filter;

//相當於web.xml的java程式組態的類別
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	//相當於註冊beans.config.xml的java程式組態的類別
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	//相當於註冊mvc-servlet.xml的java程式組態的類別
	@Override
	protected Class<?>[] getServletConfigClasses() {
//		return new Class[] {WebAppConfig.class};
		return null;
	}

	//servlet-mapping的url-pattern
	@Override
	protected String[] getServletMappings() {
//		return new String[] {"/"};
		return null;
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter("UTF-8", true);
		return new Filter[]{filter};
	}

}
