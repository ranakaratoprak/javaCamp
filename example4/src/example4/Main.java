package example4;

import example4.abstracts.BaseGamerManager;
import example4.adapters.EDevletServiceAdapter;
import example4.concretes.GameManager;
import example4.concretes.GamerManager;
import example4.concretes.SalesManager;
import example4.entities.Campaign;
import example4.entities.Game;
import example4.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		BaseGamerManager baseGamerManager = new GamerManager(new EDevletServiceAdapter());
		Gamer gamer = new Gamer(1, "Rana", "Karatoprak","11111111111", 1997);
		baseGamerManager.save(gamer);
		
		Game csgo = new Game(1, "CS GO", 50.0);
		GameManager gameManager = new GameManager();
		gameManager.add(csgo);
		
		SalesManager salesManager = new SalesManager();
		Campaign campaign = new Campaign(1, "Yaz Kampanyasý");
		salesManager.sell(gamer, csgo, campaign);
		
	}

}
