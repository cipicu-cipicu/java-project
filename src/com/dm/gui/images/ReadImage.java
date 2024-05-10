package com.dm.gui.images;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReadImage {

	public static void main(String[] args) {
		
		// image for a blank profile
		Image imageBlank = null;
		
		// image for Emma Watson
		Image imageEmma = null;
		
		// image for Daniel Radcliffe
		Image imageDaniel = null;
		
		// read images from a file and from the web
		try {
			// Blank Profile
			File file = new File("data/blank.jpg");
			imageBlank = ImageIO.read(file);

			// Emma Watson
			file = new File("data/emma.jpg");
			imageEmma = ImageIO.read(file);
			
			// Daniel Radcliffe
			//file = new File("data/daniel.jpg");
			URL url = new URL("https://image.tmdb.org/t/p/original/eOh4ubpOm2Igdg0QH2ghj0mFtC.jpg");
			imageDaniel = ImageIO.read(url);
			System.out.println("height: " + imageDaniel.getHeight(null) + " width: " + imageDaniel.getWidth(null));
			imageDaniel = imageDaniel.getScaledInstance(imageDaniel.getWidth(null) / 2, imageDaniel.getHeight(null) / 2, 0);

		} catch (IOException e) {
			System.out.println("Cannot load image...");
		}
		
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setIcon(new ImageIcon(imageBlank));
		//label.setIcon(new ImageIcon(imageEmma));
		label.setIcon(new ImageIcon(imageDaniel));

		frame.add(label);
		frame.setVisible(true);
	}

}
