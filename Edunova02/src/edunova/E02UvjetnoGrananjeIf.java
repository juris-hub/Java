package edunova;

public class E02UvjetnoGrananjeIf {
	public static void main(String[] args) {
		
		int i = 7; // ja ne znam za ovih 7
		int j = 10; // ja ne znam za ovih 10
		
		if (i == 7) {  // uvijek koristiti vitličaste zagrade
			System.out.println("To je ok");
		}
		//puni if
		
		if(i == 7) {
			System.out.println("OOK");
			
		}
		
		else {
			
			System.out.println("NIE OK");
		}
		
		if (i == 7) {
			if(j==10) {
				System.out.println("OK 1");
				
			}
			
		}
		//izraz iznad se ipak piše na ovaj način
		
		if(i == 7 & j == 10) {
			System.out.println("OK");
			
		}
		
		// operator & će provjeravati oba uvjeta
		// operator && koji ne provjerava drugi uvjet ako prvi nije zadovoljen
		
		// uobičajenija sintaksa
		
		if (i == 7 && j == 10) {
			
			
		}
	}
}
