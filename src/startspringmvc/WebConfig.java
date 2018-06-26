package startspringmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *如果没有配置视图解析器，spring会默认使用BeanNameView-Resolver,这个视图解析器会查找ID与视图名匹配的bean
 */
@Configuration
@EnableWebMvc
//@Import(WebConfig2.class)
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter{
	
	/**
	 *配置视图解析器 
	 */
	@Bean
	public ViewResolver viewResovler(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setExposeContextBeansAsAttributes(true);
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);//InternalResourceViewResolver将视图解析为JstlView
		return resolver;
	}

	/**
	 *配置静态资源处理 
	 */
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
		
	}
//
//	@Bean
//	public MessageSource messageSource(){
//		ReloadableResourceBundleMessageSource rbm = new ReloadableResourceBundleMessageSource();
//		Properties p = new Properties();
//		p.setProperty("fileEncodings", "utf-8");
//		rbm.setBasename("classpath:validmessages");
//		rbm.setFileEncodings(p);
//		rbm.setCacheSeconds(120);
//		return rbm;
//	}
//	
//	@SuppressWarnings("deprecation")
//	@Bean
//	public Validator validator(){
//		LocalValidatorFactoryBean lvfb = new LocalValidatorFactoryBean();
//		lvfb.setProviderClass(HibernateInterceptor.class);
//		lvfb.setValidationMessageSource(messageSource());
//		return lvfb;
//	}
}
