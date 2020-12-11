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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class Interface12 extends JFrame {
static int résultat;
	private JPanel contentPane;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface12 frame = new Interface12();
					frame.setTitle("QCM");
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Interface12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		Interface2 if2 = new Interface2();
		Interface3 if3 = new Interface3();
		Interface4 if4 = new Interface4();
		Interface5 if5 = new Interface5();
		Interface6 if6 = new Interface6();
		Interface7 if7 = new Interface7();
		Interface8 if8 = new Interface8();
		Interface9 if9 = new Interface9();
		Interface10 if10 = new Interface10();
		Interface11 if11 = new Interface11();
		

		JLabel lblNewLabel = new JLabel("Vous avez obtenu un score de : " + (if2.résultat + if3.résultat + if4.résultat + if5.résultat + if6.résultat + if7.résultat + if8.résultat + if9.résultat + if10.résultat + if11.résultat) + "/10");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(202, 133, 317, 67);
		contentPane.add(lblNewLabel);
		
		if ((if2.résultat + if3.résultat + if4.résultat + if5.résultat + if6.résultat + if7.résultat + if8.résultat + if9.résultat + if10.résultat + if11.résultat) > 7) {
			JLabel lblNewLabel_1 = new JLabel("BRAVO !");
			lblNewLabel_1.setBounds(309, 214, 63, 16);
			contentPane.add(lblNewLabel_1);
			
		}
		else if((if2.résultat + if3.résultat + if4.résultat + if5.résultat + if6.résultat + if7.résultat + if8.résultat + if9.résultat + if10.résultat + if11.résultat) < 5){
			JLabel lblNewLabel_1 = new JLabel("DOMMAGE :(");
			lblNewLabel_1.setBounds(291, 212, 101, 16);
			contentPane.add(lblNewLabel_1);
			
		}
		else {
			JLabel lblNewLabel_1 = new JLabel("PAS MAL !");
			lblNewLabel_1.setBounds(291, 212, 103, 16);
			contentPane.add(lblNewLabel_1);
			
		}
		
		JLabel lblFinDuQcm = new JLabel("FIN DU QCM");
		lblFinDuQcm.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblFinDuQcm.setBounds(291, 26, 103, 29);
		contentPane.add(lblFinDuQcm);
		
