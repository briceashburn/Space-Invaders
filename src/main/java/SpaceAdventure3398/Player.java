package SpaceAdventure3398;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Player extends Rectangle
{
  private static Dimension getScreenSizeSafe() {
    try {
      return Toolkit.getDefaultToolkit().getScreenSize();
    } catch (java.awt.HeadlessException e) {
      return new Dimension(1920, 1080);
    }
  }

  final Dimension screenSize = getScreenSizeSafe();
  final int width = screenSize.width;
  final int height = screenSize.height;
  ImageIcon picture;
  boolean alive;
  int locX, locY, speed, myWidth, myHeight;
  ArrayList<Projectile> bullets;
  private int health;
  private final Rectangle hitbox;

  public Player(int x, int y)
  {
    locX = x;
    locY = y;
    speed = 0;
    bullets = new ArrayList<Projectile>();
    alive = true;
    health = 100;
    hitbox = new Rectangle(70,-70,50,50);
  }

  public void setPicture(ImageIcon p)
	{
		picture = p;
	}

  public void kill()
  {
    locX = (picture != null) ? 0-picture.getIconWidth() : -50;
    locY = (picture != null) ? 0-picture.getIconHeight() : -50;
    alive = false;
  }

  public void revive()
  {
    locX = (picture != null) ? width/2-(picture.getIconWidth()/2) : width/2;
    locY = (int)(height*.8);
    health = 100;
    alive = true;
  }

  public void shoot()
  {
    int offsetX = (picture != null) ? picture.getIconWidth()/2 : 25;
    Projectile b = new Projectile(2);
    b.setLoc(locX + offsetX, locY - 5);
    bullets.add(b);
  }

  public void update()
  {
    locX += speed;
    hitbox.move(locX,locY);
    bullets.forEach(Projectile::update);
    bullets.removeIf(Projectile::hitBound);
    if(health <= 0)
    {
      kill();
    }

  }

  public void checkHit(ArrayList<Projectile> b)
  {
    for(Projectile p : b)
    {
      if(hitbox.intersects(p.getPBox()))
      {
        p.setLoc(0,height+10);
        health -= p.getDamage();
      }
    }
  }

  public void setSpeed(int s)
  {
    speed = s;
  }

  public void setX(int x)
  {
  	locX = x;
  }

  public ArrayList<Projectile> getBullets()
  {
    return bullets;
  }

  public boolean isAlive()
  {
    return alive;
  }

  public void draw(Graphics g, Component c)
  {
    if(alive)
    {
      if(picture != null)
      {
        g.drawImage(picture.getImage(),locX,locY,50,50,c);
        for(Projectile b : bullets)
          b.draw(g,c);
        g.setColor(Color.red);
        g.fillRect(150,height-80,health*2,20);
        g.setFont(new Font("Courier",Font.BOLD, 25));
        g.drawString("Health: ",20,height-60);
      }
      else
      {
        g.setColor(Color.blue);
        g.fillRect(x,y,50,50);
      }
    }
    else
    {
      g.setColor(Color.red);
      g.setFont(new Font("Courier",Font.BOLD, 25));
      g.drawString("Health: ",20,height-60);
      g.drawString("Dead", 150,height-60);
    }


  }


}
