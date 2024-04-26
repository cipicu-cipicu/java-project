package com.dm.gui.samples;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class MyFileChooser implements ActionListener {
	
	JFrame mainFrame;
	JPanel mainPanel;
	JToolBar toolBar;
	JButton openFileButton;
	JLabel fileNameLabel;
	JTextArea textArea;
	
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
		
//		fileNameLabel = new JLabel("No file selected");
//		mainPanel.add(fileNameLabel, BorderLayout.CENTER);
		
		textArea = new JTextArea();
//		mainPanel.add(textArea, BorderLayout.CENTER);
		textArea.setText("No file selected");
		
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
		
		JScrollPane scroller = new JScrollPane(textArea);
		JScrollBar bar = new JScrollBar();
		scroller.add(bar);
		mainPanel.add(scroller, BorderLayout.CENTER);

	}
	
	public void actionPerformed(ActionEvent event) {
		System.out.println("Button clicked!!");
		JFileChooser fileChooserDialog = new JFileChooser();
		int returnValue = fileChooserDialog.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(fileChooserDialog.getSelectedFile().getAbsolutePath()));
				String line = reader.readLine();
				textArea.setText("");
				while (line != null) {
					textArea.append(line + "\n");
					line = reader.readLine();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MyFileChooser app = new MyFileChooser();
		});
	}

}
