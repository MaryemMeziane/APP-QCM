/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;


public class Interface2 extends JFrame {
	
	static int résultat;
	

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface2 frame = new Interface2();
					frame.setTitle("QCM");
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Close() {
		super.dispose();
		
		
	}

	
	public Interface2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestionQuel = new JLabel("--> 1) Qu'utilise-t-on pour un commentaire sur plusieurs lignes ?");
		lblQuestionQuel.setForeground(Color.red);
		lblQuestionQuel.setBounds(19, 25, 550, 33);
		contentPane.add(lblQuestionQuel);
		
		JButton btnNewButton = new JButton("/* */");
		btnNewButton.setBounds(250, 70, 170, 48);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				résultat = résultat + 1;
				Close();
				Interface3 if3 = new Interface3();
				if3.setTitle("QCM");
				if3.setLocationRelativeTo(null);
				if3.setVisible(true);
				
				
				
			}
			
		});
		
		JButton btnNewButton_1 = new JButton("// //");
		btnNewButton_1.setBounds(250, 130, 170, 48);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface3 if3 = new Interface3();
				if3.setLocationRelativeTo(null);
				if3.setVisible(true);
				
				
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("<!-- -->");
		btnNewButton_2.setBounds(250, 190, 170, 48);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface3 if3 = new Interface3();
				if3.setLocationRelativeTo(null);
				if3.setVisible(true);
				
				
			}
		});
	}

}
