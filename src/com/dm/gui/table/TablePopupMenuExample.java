package com.dm.gui.table;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TablePopupMenuExample extends JFrame implements ActionListener {
	
	private JTable table;
	private DefaultTableModel tableModel;
	private JPopupMenu popupMenu;
	private JMenuItem menuItemAdd;
	private JMenuItem menuItemRemove;
	
	public TablePopupMenuExample() {
		String[] columnNames = new String[] {"Name", "Address", "Age"};
		String[][] tableData = new String[][] {
			{"Mary Popins", "55 Sheppard Ave", "18"},
			{"John Smith", "123 Yonge Street", "23"},
			{"Mark Twain", "80 Forrest Manor", "19"}
		};
		
		tableModel = new DefaultTableModel(tableData, columnNames);
		table = new JTable(tableModel);
		
		popupMenu = new JPopupMenu();
		menuItemAdd = new JMenuItem("Add New Row");
		menuItemAdd.addActionListener(this);
		menuItemRemove = new JMenuItem("Remove Current Row");
		menuItemRemove.addActionListener(this);
		popupMenu.add(menuItemAdd);
		popupMenu.add(menuItemRemove);
		
		table.setComponentPopupMenu(popupMenu);
		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				Point point = event.getPoint();
				int currentRow = table.rowAtPoint(point);
				table.setRowSelectionInterval(currentRow, currentRow);
			}
		});
		add(new JScrollPane(table));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 150);
	}
	
	public void actionPerformed(ActionEvent event) {
		JMenuItem menu = (JMenuItem) event.getSource();
		if (menu == menuItemAdd) {
			tableModel.addRow(new String[0]);
		} else if (menu == menuItemRemove) {
			tableModel.removeRow(table.getSelectedRow());
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new TablePopupMenuExample().setVisible(true);
		});
	}

}
