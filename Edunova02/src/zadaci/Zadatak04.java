package zadaci;

import javax.swing.JOptionPane;

public class Zadatak04 {
	
	public static void main(String[] args) {
		
		
		String broj1 = JOptionPane.showInputDialog("Unesi broj:");
		String broj2 = JOptionPane.showInputDialog("Unesi broj:");
		int brojj1 = Integer.parseInt(broj1);
		int brojj2 = Integer.parseInt(broj2);
		int produkt = brojj1 * brojj2;
		int kvocijent = brojj1 / brojj2;
		
		if (produkt % 2 == 0) {
			System.out.println(brojj1-brojj2);
			}
		else {
			System.out.println(kvocijent);
		}
	}
}
