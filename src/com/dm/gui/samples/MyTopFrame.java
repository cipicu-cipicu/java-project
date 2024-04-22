package com.dm.gui.samples;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyTopFrame extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	private static final int DEFAULT_WIDTH=800;
	private static final int DEFAULT_HEIGHT=700;
	
	public MyTopFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(new MyTablePanel(), BorderLayout.CENTER);
	}

}
