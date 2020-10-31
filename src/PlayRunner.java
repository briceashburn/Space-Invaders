import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;

public class PlayRunner extends JPanel implements ActionListener
{
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  int width = screenSize.width;
  int height = screenSize.height;
  private BufferedImage background;
  private JButton back;

  private ScreenManager manager;
  Background b = new Background();

  public PlayRunner(ScreenManager manager)
  {
    this.manager = manager;
    this.setLayout(null);

    this.add(b);
    setButton();
    UpdateBG ub = new UpdateBG(this);
		ub.start();
  }

  private void setButton()
  {
    back = new JButton();
    back.setBounds(30,40,80,30);
    back.setText("Back");
    back.addActionListener(this);
    this.add(back);
  }

  public void update()
  {
    b.update();
    repaint();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    manager.showMenu();
  }

  @Override
  public void paintComponent(Graphics g)
  {
    g.setColor(Color.black);
    g.fillRect(0,0,width,height);
    b.paintComponent(g);
    /*
    g.setColor(Color.black);
    g.fillRect(0,0,width,height);
    g. setColor(Color.cyan);
    g.fillRect(500,500,200,100);*/
  }
}
