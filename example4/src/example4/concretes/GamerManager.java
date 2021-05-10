package example4.concretes;

import example4.abstracts.BaseGamerManager;
import example4.abstracts.GamerCheckService;
import example4.abstracts.GamerService;
import example4.entities.Gamer;

public class GamerManager extends BaseGamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.save(gamer);
		}else {
		System.out.println("Not a valid person");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi: " + gamer.getFirstName() +
				"\n" + gamer.getLastName() + "\n" + gamer.getNationalityId() + "\n" + gamer.getBirthYear());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi: " + gamer.getFirstName());
	}
	
}
