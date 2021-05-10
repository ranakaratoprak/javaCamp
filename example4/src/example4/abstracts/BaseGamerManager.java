package example4.abstracts;

import example4.entities.Gamer;

public abstract class BaseGamerManager implements GamerService {
	@Override
	public void save(Gamer gamer) {
		System.out.println("Saved : " + gamer.getFirstName());
	}
}
