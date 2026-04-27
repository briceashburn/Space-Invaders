/*
  Author: Brice Ashburn

  This class will manage which screen is currently being displayed for the game.
*/

package SpaceAdventure3398;

import java.awt.*;
import javax.swing.*;

public class ScreenManager
{
  final JFrame frame = new JFrame();
  final JPanel container = new JPanel();
  final MainMenu menu = new MainMenu(this);
  final ScoreBoardDisplay sDisp = new ScoreBoardDisplay(this);
  final Settings setDisp = new Settings(this);
  final PlayRunner pRun = new PlayRunner(this);
  final About abDisp = new About(this);
  final CardLayout cl = new CardLayout();
  private boolean isFullScreen = false;


  public ScreenManager()
	{
		runPanels();
	}

  //this adds the various panels to the screen manager so that it can switch between them easily.
  //it also sets the frame for the game.
	private void runPanels()
	{
    container.setLayout(cl);
    container.add(menu, "1");
    container.add(pRun, "2");
    container.add(sDisp, "3");
	  sDisp.setScoreboard(new Scoreboard() );
    container.add(setDisp, "4");
    container.add(abDisp, "5");
    cl.show(container, "1");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(container);
		frame.pack();
		makeFullScreen();
	}

  public int accessDifficultySetting()
  {
    return setDisp.getDifficulty();
  }

  //switches to the main menu screen
  public void showMenu()
  {
    cl.show(container, "1");
  }

  //swtiches to the gameplay panel
  public void showPlay()
  {
    cl.show(container, "2");
    pRun.startPlay();
  }

  //switches to the scoreboard
  public void showScoreB()
  {
    sDisp.repaint();
    cl.show(container, "3");
  }

  //switches to the settings panel
  public void showSettings()
  {
    cl.show(container, "4");
  }

  //switches to the about panel
  public void showAbout()
  {
    cl.show(container, "5");
  }

  //makes the game frame full screen
  public void makeFullScreen()
  {
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    frame.setVisible(false);
    frame.dispose();
    frame.setUndecorated(true);
    if (gd.isFullScreenSupported()) {
      gd.setFullScreenWindow(frame);
    } else {
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      frame.setVisible(true);
    }
    isFullScreen = true;
  }

  //makes the game frame go to a windowed view
  public void stopFullScreen()
  {
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    gd.setFullScreenWindow(null);
    frame.setVisible(false);
    frame.dispose();
    frame.setUndecorated(false);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setVisible(true);
    isFullScreen = false;
  }

  public boolean isFullScreen()
  {
    return isFullScreen;
  }

}
