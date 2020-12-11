/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.io.FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class LectureCSV {

public static void main(String[] arguments) {
	int x = 0;
	String tableau[] = new String[4];
	
	BufferedReader bufReader = null;
	try {
		bufReader = new BufferedReader(new FileReader("DATA.csv"));
		String rowData = "";
		bufReader.readLine(); // Enleve la premiere colonne dans DATA.csv
		String [] databyrow;
		while ((rowData = bufReader.readLine())!=null) {
			databyrow = rowData.split(";"); // Convertir String en Tableau
			
			for (int i = 0 ; i< databyrow.length; i++) {
				String s = databyrow[i];
				System.out.println(s);
				tableau[i]= s;
			}
			System.out.println("--- VOTRE REPONSE---");
			Scanner sc = new Scanner(System.in);
			String reponse = sc.next();
			

			if(reponse.equals(tableau[1]) ) {
				System.out.println("Bonne réponse");
				x++;
			}
			else{
				System.out.println("Mauvaise réponse");
			}
			
		}
		
	} catch  (Exception e) {
		
	}
	
	System.out.println("Vous avez un score de " + x + "/10");
	
	
	}
}
