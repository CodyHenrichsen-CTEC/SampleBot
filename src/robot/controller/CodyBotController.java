package robot.controller;

import lejos.nxt.Button;
import robot.model.CodyBot;

public class CodyBotController
{
	private CodyBot myBot;
	
	public CodyBotController()
	{
		myBot = new CodyBot();
	}
	
	
	public void start()
	{
		while( Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			
				myBot.drawShape(1, 1);
		}
	}

}
