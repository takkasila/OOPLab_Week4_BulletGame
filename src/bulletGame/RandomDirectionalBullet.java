package bulletGame;

import java.util.Random;

import org.newdawn.slick.Graphics;

public class RandomDirectionalBullet extends DirectionalBullet {

	final static float MAX_SWING_X = 2;
	final static float MAX_SWING_Y = 2;
	
	float xBySwing, yBySwing;
	
	Random rand;
	
	public RandomDirectionalBullet(float start_pos_x, float start_pos_y,
			float dir, float velocity) {
		super(start_pos_x, start_pos_y, dir, velocity);
		
		xBySwing = yBySwing = 0;
		rand = new Random();
	}
	
	@Override
	public void Update(int delta)
	{
		float x = (float) (Math.cos(Math.toRadians( direction) ) * vel);
		float y = (float) (Math.sin(Math.toRadians( direction) ) * vel);
		
		xBySwing = ( rand.nextFloat() * 2 - 1 ) * MAX_SWING_X; 
		yBySwing = ( rand.nextFloat() * 2 - 1 ) * MAX_SWING_Y;
		
		SetXY(GetPos_x()+ ( x + xBySwing ), GetPos_y()- ( y + yBySwing ) );
	
		
	}
	@Override
	public void Render(Graphics g)
	{
		g.fillOval(GetPos_x(), GetPos_y(), BULLET_SIZE, BULLET_SIZE);
	}
	

}
