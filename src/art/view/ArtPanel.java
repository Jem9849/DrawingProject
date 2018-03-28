package art.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import art.controller.ArtController;

public class ArtPanel extends JPanel
{
	private final int MINIMUM_EDGE = 5;
	private final int MAXIMUM_EDGE = 20;
	private final int MINIMUM_SCALE = 20;
	private final int MAXIMUM_SCALE = 100;
	
	private ArtController app;
}
