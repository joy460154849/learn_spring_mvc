package startspringmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * AbstractAnnotationConfigDispatcherServletInitializer:同时创建DispatcherServlet和ContextLoaderListener.getServletConfigClasses()来加载配置文件
 * DispatchServlet:任务：将请求发送给Springmv controller；启动DispatchServlet时，创建spring配置上下文，加载类中的所有声明的bean
 * ContextLoaderListener:任务：创建应用上下文的bean 加载驱动后端的中间层和数据层组件
 */
public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	/**
	 * 
	 *加载指定配置类（使用java配置的应用上下文）
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	/**
	 *将DispatchServlet映射到哪里：将一个或者多个路径映射到DispatcherServlet上，这里默认映射到“/”
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
