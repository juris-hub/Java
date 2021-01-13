package zadaci;

import javax.swing.JOptionPane;

public class Zadatak03 {
	
public static void main(String[] args) {
		
	
	String broj1 = JOptionPane.showInputDialog("Unesi broj:");
	int brojj1 = Integer.parseInt(broj1);
	
	System.out.println(brojj1%2==0 ? "Osijek" : "Zagreb");
	
	}

}
