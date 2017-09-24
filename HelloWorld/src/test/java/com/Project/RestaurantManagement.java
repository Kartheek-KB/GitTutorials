package com.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RestaurantManagement {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantManagement window = new RestaurantManagement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RestaurantManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 300, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Paradise");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(312, 11, 61, 50);
		frame.getContentPane().add(lblNewLabel);
		
	
		JButton btnTable = new JButton("Table 1");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order Table1= new Order();
				Table1.setVisible(true);
				
			}
		});
		btnTable.setBounds(70, 71, 89, 23);
		frame.getContentPane().add(btnTable);
		
		JButton btnTable_1 = new JButton("Table 2");
		btnTable_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order Table2= new Order();
				Table2.setVisible(true);
				
			}
		});
		btnTable_1.setBounds(236, 72, 89, 23);
		frame.getContentPane().add(btnTable_1);
		
		
	}
}
