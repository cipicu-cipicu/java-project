package com.dm.gui.table;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class TableEventsApplication extends JFrame {

	JTable table;
	JLabel label;

	public TableEventsApplication() {
		setLayout(new BorderLayout());
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TableModel tableModel = new TableModel();
		ArrayList<String> actors = new ArrayList<String>();
		actors.add("Daniel Radcliffe");
		actors.add("Emma Watson");
		tableModel.setActors(actors);

		JTable table = new JTable(tableModel);
		add(table, BorderLayout.CENTER);

		JLabel label = new JLabel();
		label.setText("");
		add(label, BorderLayout.SOUTH);

		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				Point point = event.getPoint();
				int clickedRow = table.rowAtPoint(point);
				System.out.println(clickedRow);
				if (clickedRow >= 0) {
					String actorName = (String) table.getValueAt(clickedRow, 0);
					label.setText(actorName);
				} else {
					label.setText("");
				}
			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new TableEventsApplication().setVisible(true);
		});
	}

}
