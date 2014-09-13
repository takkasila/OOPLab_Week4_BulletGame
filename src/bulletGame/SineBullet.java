package bulletGame;

import org.newdawn.slick.Graphics;

public class SineBullet extends DirectionalBullet {
	
	final static float MAX_AMPLITUDE = 30;
	final static float COUNTER_CONSTANT = 0.1f;
	
	float xBySin, yBySin;
	float counter;
	
	public SineBullet(float start_pos_x, float start_pos_y, float dir,
			float velocity) {
		super(start_pos_x, start_pos_y, dir, velocity);
		counter = 0;
	}
	
	@Override
	public void Update(int delta)
	{
		float x = (float) (Math.cos(Math.toRadians( direction) ) * vel);
		float y = (float) (Math.sin(Math.toRadians( direction) ) * vel);
		
		float lengthBySin = (float) (MAX_AMPLITUDE * Math.sin( counter ));
		
		xBySin = (float) (lengthBySin * Math.cos(Math.toRadians( direction + 90 )));
		yBySin = (float) (lengthBySin * Math.sin(Math.toRadians( direction + 90 )));
		
		SetXY(GetPos_x()+x, GetPos_y()-y);
		
		counter += COUNTER_CONSTANT;
		
	}
	@Override
	public void Render(Graphics g)
	{
		g.fillOval(GetPos_x() + xBySin , GetPos_y() - yBySin , BULLET_SIZE, BULLET_SIZE);
		
	}
	
	
	

}
