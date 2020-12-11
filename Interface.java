
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
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
    public class Interface extends JFrame {
	
	
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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

	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQcmcultureGnrale = new JLabel("QCM (---> JAVA <--- )");
	
		lblQcmcultureGnrale.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblQcmcultureGnrale.setBounds(225, 35, 206, 27);
		contentPane.add(lblQcmcultureGnrale);
		
		JLabel lblNewLabel = new JLabel("Veuillez répondre au 10 questions.");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel.setBounds(6, 85, 425, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnCommencer = new JButton("***Commencer***");
		btnCommencer.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		btnCommencer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface2 if2 = new Interface2();
				if2.setLocationRelativeTo(null);
				if2.setVisible(true);
				
				
			}
			
			
		});
		btnCommencer.setBounds(207, 252, 206, 50);
		contentPane.add(btnCommencer);
		
		
	}
}


