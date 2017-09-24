package com.Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(22, 0, 200, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblStarter = new JLabel("Starter");
		lblStarter.setBounds(10, 59, 200, 50);
		contentPane.add(lblStarter);
		
		JCheckBox chckbxManchuria = new JCheckBox("Manchuria");
		chckbxManchuria.setBounds(75, 73, 97, 23);
		contentPane.add(chckbxManchuria);
		
		JCheckBox chckbxSpringrolls = new JCheckBox("SpringRolls");
		chckbxSpringrolls.setBounds(174, 73, 97, 23);
		contentPane.add(chckbxSpringrolls);
		
		JCheckBox chckbxBabycorn = new JCheckBox("BabyCorn");
		chckbxBabycorn.setBounds(292, 73, 97, 23);
		contentPane.add(chckbxBabycorn);
		
		JLabel lblMainCourse = new JLabel("Main Course");
		lblMainCourse.setBounds(10, 110, 66, 50);
		contentPane.add(lblMainCourse);
		
		JCheckBox chckbxVegBiryani = new JCheckBox("Veg Biryani");
		chckbxVegBiryani.setBounds(82, 124, 97, 23);
		contentPane.add(chckbxVegBiryani);
		
		JCheckBox chckbxVegFriedRice = new JCheckBox("Veg Fried Rice");
		chckbxVegFriedRice.setBounds(201, 124, 97, 23);
		contentPane.add(chckbxVegFriedRice);
		
		JLabel lblDesserts = new JLabel("Desserts");
		lblDesserts.setBounds(0, 165, 200, 50);
		contentPane.add(lblDesserts);
		
		JCheckBox chckbxIceCreams = new JCheckBox("Ice Creams");
		chckbxIceCreams.setBounds(82, 179, 97, 23);
		contentPane.add(chckbxIceCreams);
		
		JButton btnBill = new JButton("Bill");
		btnBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 Bill b1=new Bill();
			 b1.setVisible(true);
			}
		});
		btnBill.setBounds(292, 210, 89, 23);
		contentPane.add(btnBill);
		
		
		
	}

}
