package zadaci;

import javax.swing.JOptionPane;

public class Zadatak01 {
	//korisnik unosi cijeli broj
	//program ispisuje 1 ako je neparan, 0 ako je paran
	public static void main(String[] args) {
		
		String broj = JOptionPane.showInputDialog("Unesi broj:");
		int brojj = Integer.parseInt(broj);
		
		if(brojj % 2 == 1) {
			
			System.out.println("1");
		}
		
		else {
			
			System.out.println("0");
			
		}
		
	}
	
}
