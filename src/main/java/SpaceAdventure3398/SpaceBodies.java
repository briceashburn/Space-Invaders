/*
 * Author: Brice Ashburn
 * 
 * Interface to for stars, planets and other spacebodies.
 * They need a function to update, draw, and to get the framewidth
 */

package SpaceAdventure3398;

import java.awt.*;
public interface SpaceBodies 
{
	public void update();
	public void draw(Graphics g);
	public void setFrameWidth(int x);
}
