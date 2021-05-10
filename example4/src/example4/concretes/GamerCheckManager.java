package example4.concretes;

import example4.abstracts.GamerCheckService;
import example4.entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}
	
}
