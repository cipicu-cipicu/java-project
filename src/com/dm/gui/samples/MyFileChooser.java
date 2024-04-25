package com.dm.gui.samples;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class MyFileChooser implements ActionListener {
	
	JFrame mainFrame;
	JPanel mainPanel;
	JToolBar toolBar;
	JButton openFileButton;
	JLabel fileNameLabel;
	
	public MyFileChooser() {
		mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500, 400);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		toolBar = new JToolBar();
		mainPanel.add(toolBar, BorderLayout.NORTH);
		
		openFileButton = new JButton("Open File");
		openFileButton.addActionListener(this);
		toolBar.add(openFileButton);
		
		fileNameLabel = new JLabel("No file selected");
		mainPanel.add(fileNameLabel, BorderLayout.CENTER);
		
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		System.out.println("Button clicked!!");
		JFileChooser fileChooserDialog = new JFileChooser();
		int returnValue = fileChooserDialog.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			fileNameLabel.setText(
					fileChooserDialog.getSelectedFile().getAbsolutePath());
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MyFileChooser app = new MyFileChooser();
		});
	}

}
