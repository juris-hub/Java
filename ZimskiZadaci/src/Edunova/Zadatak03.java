package Edunova;
import javax.swing.JOptionPane;
public class Zadatak03 {
	public static void main(String[] args) {
		
		String broj1 = JOptionPane.showInputDialog("Unesi prvi broj: ");
		int a = Integer.parseInt(broj1);
		String broj2 = JOptionPane.showInputDialog("Unesi drugi broj: ");
		int b = Integer.parseInt(broj2);
		int i,j,flag;
		for(i = a; i<=b; i++) {
			
				if(i == 0 || i == 1) 
					continue;
			flag = 1;
				
			for (j = 2; j<= i / 2; ++j) {
				if(i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
			
				System.out.println("Prosti brojevi su: " + i);
				}
			}
		}
	}
