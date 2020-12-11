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

public class Interface6 extends JFrame {
	static int résultat;

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface6 frame = new Interface6();
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

	
	public Interface6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblQuestionQuel = new JLabel("--> 5) Quel package / structure est la plus récente pour les interfaces graphiques ?");
		lblQuestionQuel.setForeground(Color.red);
		lblQuestionQuel.setBounds(19, 25, 550, 33);
		contentPane.add(lblQuestionQuel);
		
		JButton btnNewButton = new JButton("swing");
		btnNewButton.setBounds(250, 70, 170, 48);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface7 if7 = new Interface7();
				if7.setLocationRelativeTo(null);
				if7.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("directx");
		btnNewButton_1.setBounds(250, 130, 170, 48);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Close();
				Interface7 if7 = new Interface7();
				if7.setLocationRelativeTo(null);
				if7.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("javafx");
		btnNewButton_2.setBounds(250, 190, 170, 48);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				résultat++;
				
				Close();
				Interface7 if7 = new Interface7();
				if7.setTitle("QCM");
				if7.setLocationRelativeTo(null);
				if7.setVisible(true);
				
				
			}
		});
	}

	


	}
