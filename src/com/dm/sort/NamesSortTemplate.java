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
 * Step 2. Generate an array of strings that includes 500 full names, and save them
 * in a new file called "full-names.txt", one name per line
 * 
 * Step 3. Sort the array using bubble sort, and save to a new file called "sorted-names.txt"
 * 
 */

public class NamesSortTemplate {
	
	public static void main(String[] args) throws Exception {
		readWriteFile();
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
