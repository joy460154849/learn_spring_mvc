package startspringmvc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	// @Autowired
	// private SpittleRepository spittleRepository;
	//
	//
	// public SpittleController(SpittleRepository spittleRepository) {
	// this.spittleRepository = spittleRepository;
	// }

	/**
	 * 把参数传入视图中，可以使用Model 或者 Map 或者默认 这里使用Model
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid Spittle spittle, BindingResult errors, Model model) {
		if (errors.hasErrors()) {
			return "registerForm";
		}
		List<Spittle> spittleList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Spittle s = new Spittle("spittle " + i, Calendar.getInstance().getTime());
			spittleList.add(s);
		}
		model.addAttribute("spittleList",spittleList);
		return "spittle";
	}

	// /**
	// *把参数传入视图中，可以使用Model 或者 Map，或者默认
	// *这里使用Map
	// */
	// @RequestMapping(method=RequestMethod.GET)
	// public String spittle(Map model){
	// List<Spittle> spittleList = new ArrayList<>();
	// for(int i=0;i<20;i++){
	// Spittle s = new Spittle("spittle "+i, Calendar.getInstance().getTime());
	// spittleList.add(s);
	// }
	// model.put("spittleList",spittleList);
	// return "spittle";
	// }
	//
	// /**
	// *把参数传入视图中，可以使用Model 或者 Map，或者默认
	// *使用默认方式，这里默认视图名为spittles ,模型的key 会根据类型判断出来，这里spittleList
	// */
	// @RequestMapping(method=RequestMethod.GET)
	// public List<Spittle> spittles(){
	// List<Spittle> spittleList = new ArrayList<>();
	// for(int i=0;i<20;i++){
	// Spittle s = new Spittle("spittle "+i, Calendar.getInstance().getTime());
	// spittleList.add(s);
	// }
	// return spittleList;
	// }

	// /**
	// *处理查询参数
	// *@RequestParam:让他接收参数，max,count
	// ,若max=null，则max=111，同理，若count=null，则count=222
	// *defaultValue 给定的类型是 String ,但是绑定参数后，他会自动转成long
	// *
	// */
	// @RequestMapping(method=RequestMethod.GET)
	// public List<Spittle>
	// spittle(@RequestParam(value="max",defaultValue="111") long
	// max,@RequestParam(value="count",defaultValue="222") int count){
	// List<Spittle> spittleList = new ArrayList<>();
	// for(int i=0;i<20;i++){
	// Spittle s = new Spittle("spittle "+i, Calendar.getInstance().getTime());
	// spittleList.add(s);
	// }
	// return spittleList;
	// }

	// /**
	// *处理查询参数
	// *@RequestParam:让他接收参数，max,count ,若max=null
	// *@RequestParam("max") long max 这个处理器方法将会处理形如/spittles?max=12345这样的请求
	// * */
	// @RequestMapping(method=RequestMethod.GET)
	// public List<Spittle> spittle(@RequestParam("max") long
	// max,@RequestParam("count") int count){
	// List<Spittle> spittleList = new ArrayList<>();
	// for(int i=0;i<20;i++){
	// Spittle s = new Spittle("spittle "+i, Calendar.getInstance().getTime());
	// spittleList.add(s);
	// }
	// return spittleList;
	// }

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterForm(@Valid Spittle spittle, Errors errors, Model model) {
		model.addAttribute(new Spittle());
		return "registerForm";
	}
}
