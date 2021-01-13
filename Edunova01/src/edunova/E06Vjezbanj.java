package edunova;

import javax.swing.JOptionPane;

public class E06Vjezbanj {

	//Korisnik unosi decimalni broj, program ispisuje samo cijeli dio broja
	public static void main(String[] args) {
		
		String brojJedan = JOptionPane.showInputDialog("Unesi broj:");
		float broj=Float.parseFloat(brojJedan);
		
		int brojj = (int)broj;
		
		System.out.println(brojj+broj-broj);
	
	}
}
