package bulletGame;

import org.newdawn.slick.Graphics;

public class DirectionalBullet extends Bullet {

	
	float direction;
	float vel;
	
	public DirectionalBullet(float start_pos_x, float start_pos_y, float dir, float velocity)
	{
		super(start_pos_x, start_pos_y);
		direction = dir;
		vel = velocity;
	}
	
	@Override
	public void Update(int delta)
	{
		float x = (float) (Math.cos(direction) * vel);
		float y = (float) (Math.sin(direction) * vel);
		
		SetXY(GetPos_x()+ x, GetPos_y()- y);
		
	}
	@Override
	public void Render(Graphics g)
	{
		g.fillOval(GetPos_x(), GetPos_y(), BULLET_SIZE, BULLET_SIZE);
	
	
	}
	
	public float getVelocity()
	{
		return vel;
	}
	public float getDirection()
	{
		return direction;
	}
	

}
