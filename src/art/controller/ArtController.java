package art.controller;

import java.io.IOException;

import art.view.ArtFrame;

public class ArtController 
{
	private ArtFrame frame;
	
	public ArtController()
	{
		
	}
	
	void start()
	{
		
	}
	
	public ArtFrame getFrame()
	{
		return frame;
	}
	
	public void handleErrors(IOException error)
	{
		System.out.println(error);
	}
}
