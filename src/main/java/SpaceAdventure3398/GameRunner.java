/*
 * Author: Brice Ashburn
 *
 * This class is will start the running of the game and is what kicks everything off.
 */

package SpaceAdventure3398;

import javax.swing.*;

public class GameRunner
{
	public static void main(String args[])
	{

		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new ScreenManager();
			}
		});
	}

}
