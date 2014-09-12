package bulletGame;

public class DirectionalBullet extends Bullet {
	
	float direction;
	float vel;
	
	public DirectionalBullet(float x, float y, float dir, float velocity)
	{
		super(x,y);
		direction = dir;
		vel = velocity;
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
