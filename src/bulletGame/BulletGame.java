package bulletGame;

import java.util.LinkedList;

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

	LinkedList<Entity> entities;
	
	public BulletGame(String title) {		super(title);
		entities = new LinkedList<>();
	}

	public static void main(String[] args) throws SlickException {

		BulletGame game = new BulletGame("Bullet Game");
		AppGameContainer appgc = new AppGameContainer(game);
		
		appgc.setDisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT, false);
		appgc.setTargetFrameRate(60);
		appgc.start();
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		
		entities.add(new DirectionalBullet(100, 100, 45, 2));
		//entities.add(new DirectionalBullet(100, 100));
		entities.add(new Bullet(SCREEN_WIDTH/2, SCREEN_HEIGHT/2));
		
	}
	@Override
	public void render(GameContainer arg0, Graphics graphic) throws SlickException {
		
		for(Entity entity : entities)
		{
			entity.Render(graphic);
		}
		
	}

	@Override
	public void update(GameContainer arg0, int delta) throws SlickException {
		for(Entity entity : entities)
		{
			entity.Update(delta);
		}
	}

}
