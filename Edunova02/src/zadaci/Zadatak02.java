package zadaci;

import javax.swing.JOptionPane;

public class Zadatak02 {
	public static void main(String[] args) {
		
		String broj1 = JOptionPane.showInputDialog("Unesi broj:");
		String broj2 = JOptionPane.showInputDialog("Unesi broj:");
		String broj3 = JOptionPane.showInputDialog("Unesi broj:");
		
		int brojj1 = Integer.parseInt(broj1);
		int brojj2 = Integer.parseInt(broj2);
		int brojj3 = Integer.parseInt(broj3);
		
		if (brojj1 > brojj2 & brojj1 > brojj3) {
			
			System.out.println("Najveci broj = " + brojj1);
		}
		
		else if (brojj2 > brojj1 & brojj2 > brojj3) {
			
			System.out.println("Najveci broj = " + brojj2);
		}
		
		else if (brojj3 > brojj1 & brojj3 > brojj2) {
			
			System.out.println("Najveci broj = " + brojj3);
		}
	
	else {
		System.out.println("Isti su");
		
		}
	}
}
