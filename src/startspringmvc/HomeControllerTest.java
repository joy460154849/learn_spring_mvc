package startspringmvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception{
		HomeController controller = new HomeController();
		MockMvc mockMVC = MockMvcBuilders.standaloneSetup(controller).build();
		//对"/"执行GET请求，预期得到home视图
		mockMVC.perform(get("/")).andExpect(view().name("home"));
	}
	
//	@Test
//	public void shouldShowRecentSpittles(){
//		List<Spittle> expectedSpittle = crateSpittle(20);
//		SpittleRepository mockRepository = mock(SpittleRepository.class);
//		when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(exceptedSpittles);
//	}
//	
//	private List<Spittle> crateSpittle(int count){
//		List<Spittle> spittle = new ArrayList<>();
//		for(int i=0;i<count;i++){
//			spittle.add(new Spittle("Spittle "+i, new Date()));
//		}
//		return spittle;
//	}
}
