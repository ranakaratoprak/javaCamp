package example4.adapters;

import example4.abstracts.GamerCheckService;
import example4.entities.Gamer;

public class EDevletServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		if(!(gamer.getFirstName().isEmpty()) && !(gamer.getLastName().isEmpty()) &&
				(gamer.getNationalityId().length() == 11) && (String.valueOf(gamer.getBirthYear()).length() == 4)) {
			return true;
		}else {
			return false;
		}
	}

}
