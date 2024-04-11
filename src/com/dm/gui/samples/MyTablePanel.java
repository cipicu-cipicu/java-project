package com.dm.gui.samples;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import com.dm.collections.Student;

public class MyTablePanel extends JPanel {
	
	private Student[] students;

	public MyTablePanel() {
		students = new Student[3];
		students[0] = new Student("Mary", "Smith", "female", null);
		students[1] = new Student("Joe", "Doe", "male", null);
		students[2] = new Student("Alice", "Martin", "female", null);
		
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setBackground(Color.BLUE);
		
		JTable table = new JTable(new MyTableModel());
		add(table, BorderLayout.CENTER);
	}
	
	private class MyTableModel extends AbstractTableModel {

		public int getRowCount() {
			return students.length;
		}

		@Override
		public int getColumnCount() {
			return 2;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			String columnValue = "";
			switch (columnIndex) {
			case 0:
				columnValue = students[rowIndex].getFirstName();
				break;
			case 1:
				columnValue = students[rowIndex].getLastName();
				break;
			}
			return columnValue;
		}
		
	}
}
