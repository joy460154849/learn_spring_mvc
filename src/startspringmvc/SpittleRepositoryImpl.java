package startspringmvc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SpittleRepositoryImpl implements SpittleRepository{

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> spittleList = new ArrayList<>();
		for(int i=0;i<count;i++){
			Spittle s = new Spittle("spittle "+i, Calendar.getInstance().getTime());
			spittleList.add(s);
		}
		return null;
	}

}
