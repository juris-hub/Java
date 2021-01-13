package edunova;

import javax.swing.JOptionPane;

public class E04Vjezbanje {
		public static void main(String[] args) {
			
			// Korisnik unosi dva cijela broja.
			// Program ispisuje brojeve jedan pored drugog.
			
			String brojJedan = JOptionPane.showInputDialog("Unesi broj:");
			String brojDva = JOptionPane.showInputDialog("Unesi broj:");
			
			int b1 = Integer.parseInt(brojJedan);
			int b2 = Integer.parseInt(brojDva);
			
			System.out.println("Vaši brojevi su : " + b1 + " " + b2);
			
		}
}
