package example4.concretes;

import example4.abstracts.SalesService;
import example4.entities.Campaign;
import example4.entities.Game;
import example4.entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void sell(Gamer gamer, Game game) {
		System.out.println(game.getGameName() + " oyunu " + gamer.getFirstName() + " adl� oyuncuya sat�lm��t�r.");
		
	}

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " oyunu " + gamer.getFirstName() + " adl� oyuncuya " + campaign.getCampaignName() + " kampanyas� ile indirimli sat�lm��t�r.");
		
	}

}
