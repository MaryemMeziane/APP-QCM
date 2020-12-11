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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Interface3 extends JFrame {
	static int résultat;
	
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface3 frame = new Interface3();
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


	
	public Interface3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblQuestionQuel = new JLabel("--> 2) Quel entreprise a conçu le Java ?");
		lblQuestionQuel.setForeground(Color.red);
		lblQuestionQuel.setBounds(19, 25, 550, 33);
		contentPane.add(lblQuestionQuel);
		
		
		
		
		JButton btnNewButton = new JButton("Apple");
		btnNewButton.setBounds(250, 70, 170, 48);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface4 if4 = new Interface4();
				if4.setLocationRelativeTo(null);
				if4.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Sun Microsystems");
		btnNewButton_1.setBounds(250, 130, 170, 48);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				résultat = résultat +1;
				
				Close();
				Interface4 if4 = new Interface4();
				if4.setTitle("QCM");
				if4.setLocationRelativeTo(null);
				if4.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("IBM");
		btnNewButton_2.setBounds(250, 190, 170, 48);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface4 if4 = new Interface4();
				if4.setLocationRelativeTo(null);
				if4.setVisible(true);
		
				
				
			}
		});
	}
}
