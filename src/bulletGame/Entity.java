package bulletGame;

import org.newdawn.slick.Graphics;

public interface Entity {
	void Render(Graphics g);
	void Update(int delta);
}
