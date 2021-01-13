package zadaci;

import javax.swing.JOptionPane;

public class Zadatak02 {
	public static void main(String[] args) {
		//program unosi dva cijela broja
		// Ispisuje ok ako je zbroj svih unesenih parnih brojeva između  ta dva cijela broja
		// veći od 1000
		
		String b1 = JOptionPane.showInputDialog("Unesi prvi broj: ");
		int a = Integer.parseInt(b1);
		String b2 = JOptionPane.showInputDialog("Unesi drugi broj: ");
		int b = Integer.parseInt(b2);
		
		int zbroj = 0;
		
		for(int i = a ; a<b ; i++) {
			if(i%2 == 0) {
				zbroj+=i;
			}
			
		}
		if(zbroj > 1000) {
			System.out.println("Ok");
			
		}
	}
}
