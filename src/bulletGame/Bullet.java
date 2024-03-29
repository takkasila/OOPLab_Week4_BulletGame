package bulletGame;

import org.newdawn.slick.Graphics;

public class Bullet implements Entity{

	final static float BULLET_SIZE = 5;
	
	float pos_x, pos_y;
	
	public Bullet(float start_pos_x, float start_pos_y)
	{
		SetXY(start_pos_x, start_pos_y);
	}
	
	@Override
	public void Update(int delta) {
		
		
		
	}
	@Override
	public void Render(Graphics g) {
		
		g.fillOval(pos_x, pos_y, BULLET_SIZE, BULLET_SIZE);
		
	}

	
	public float GetPos_x()
	{
		return pos_x;
	}
	public float GetPos_y()
	{
		return pos_y;
	}
	protected void SetXY(float new_x, float new_y)
	{
		pos_x = new_x;
		pos_y = new_y;
	}

}
