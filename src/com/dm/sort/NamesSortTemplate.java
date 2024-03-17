package com.dm.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/*
 * Sort names in alphabetical order
 * 
 * The file will have a comma separated list of first names in the first line,
 * and a comma separated list of last names in the second line (see file names.txt)
 * 
 * Step 1. Read the first names and last names in two arrays of strings
 * 
 * Step 2. Generate an array of strings that includes 10 full names, and save them
 * in a new file called "full-names.txt", one name per line
 * 
 * Step 3. Sort the array using bubble sort, and save to a new file called "sorted-names.txt"
 * 
 */

public class NamesSortTemplate {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("data" + File.separator + "names.txt"));
		PrintWriter writer = new PrintWriter("data" + File.separator + "names1.txt");
		String firstNamesLine = reader.readLine();
		String firstNames[] = firstNamesLine.split(",");
		String lastNamesLine = reader.readLine();
		String lastNames[] = lastNamesLine.split(",");
		String fullNames[] = new String[10];
		
		for (int i = 0; i < fullNames.length; i++) {
			fullNames[i] = firstNames[(int)(firstNames.length * Math.random())] + " " + lastNames[(int)(lastNames.length * Math.random())];
			System.out.println(fullNames[i]);
		}
		
		for (int p = 0; p < fullNames.length; p++) {
			for (int i = 0; i < (fullNames.length - 1); i++) {
				String value1 = fullNames[i];
				String value2 = fullNames[i+1];
				if (value1.compareToIgnoreCase(value2) > 0) {
					fullNames[i] = value2;
					fullNames[i+1] = value1;
				}
			}
		}
		
		System.out.println( );
		
		for (int i = 0; i < fullNames.length; i++) {
			System.out.println(fullNames[i]);
			writer.println(fullNames[i]);
		}
		
		
		reader.close();
		writer.close();
		
		
	}

	public static void readFile() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("data" + File.separator + "names.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
	}

	public static void readWriteFile() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("data" + File.separator + "names.txt"));
		PrintWriter writer = new PrintWriter("data" + File.separator + "names1.txt");
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			writer.println(line);
			line = reader.readLine();
		}
		reader.close();
		writer.close();
	}
	
}
