package com.dm.gui.table;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	private ArrayList<String> actors;

	public int getRowCount() {
		return actors.size();
	}

	public int getColumnCount() {
		return 2;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		String columnValue = "";
		switch (columnIndex) {
		case 0:
			columnValue = actors.get(rowIndex);
			break;
		case 1:
			columnValue = "Column 2";
			break;
		}
		return columnValue;
	}
	
	public ArrayList<String> getActors() {
		return actors;
	}

	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}

}
