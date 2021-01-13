package edunova;
import javax.swing.JOptionPane;
public class E07Vjezbanje {
	public static void main(String[] args) {
		
		String brojJedan = JOptionPane.showInputDialog("Unesi broj:");
		float broj=Float.parseFloat(brojJedan);
		
		int brojj = (int)broj;
		System.out.println(broj);
		System.out.println(brojj-broj);
		System.out.println(brojj);
	}

}
