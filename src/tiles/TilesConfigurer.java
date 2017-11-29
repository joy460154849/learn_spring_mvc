//package tiles;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.view.tiles3.TilesViewResolver;;
//
//@Configuration
//public class TilesConfigurer {
//
//	@Bean
//	public TilesConfigurer tilesConfigurer(){
//		TilesConfigurer tiles = new TilesConfigurer();
//		tiles.setDefinitions(new String[]{"WEB-INF/layout/tiles.xml"});
//		tiles.setCheckRefresh(true);
//		return tiles;
//	}
//	
//	private void setCheckRefresh(boolean b) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void setDefinitions(String[] strings) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Bean
//	public ViewResolver viewResover(){
//		return new TilesViewResolver();
//	}
//}
