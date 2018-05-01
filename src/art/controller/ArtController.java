package art.controller;

import javax.swing.JOptionPane;
import art.view.ArtFrame;

public class ArtController 
{
	private ArtFrame appFrame;
	
	public ArtController()
	{
		appFrame = new ArtFrame(this);
	}
	
	void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to art!");
	}
	
	public ArtFrame getFrame()
	{
		return appFrame;
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
}
