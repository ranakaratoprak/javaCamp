package example4.concretes;

import example4.abstracts.GameService;
import example4.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellendi: " + game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: " + game.getGameName());		
	}

}
