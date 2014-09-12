package bulletGame;

import javax.security.auth.login.AppConfigurationEntry;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class BulletGame extends BasicGame {
	
	final static int FRAMERATE = 60;
	final static int SCREEN_WIDTH = 800;
	final static int SCREEN_HEIGHT = 600;

	public BulletGame(String title) {
		super(title);
	}

	public static void main(String[] args) throws SlickException {

		BulletGame game = new BulletGame("Bullet Game");
		
		AppGameContainer appgc = new AppGameContainer(game);
		
		appgc.setDisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT, false);
		
		appgc.setTargetFrameRate(60);
		appgc.start();
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		
		
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		
	}

}
