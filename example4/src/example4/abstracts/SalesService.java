package example4.abstracts;

import example4.entities.Campaign;
import example4.entities.Game;
import example4.entities.Gamer;

public interface SalesService {
	void sell(Gamer gamer, Game game);
	void sell(Gamer gamer, Game game, Campaign campaign);
}
