package zadaci;

public class Zadatak01 {
	public static void main(String[] args) {
		
		// Program ispisuje sve brojeve od 20 do 200
		
		// Program ispisuje sve parne brojeve od 1 do 57
		
		// Program ispisuje sve brojeve od 100 do 1 
		
		// Program ispisuje sve neparne od 100 do 21
		
		
		for(int i=20 ; i < 201 ; i++) {
			System.out.println(i);
			
		}
		
		for(int i = 1; i < 58; i++ ) {
			if (i % 2 == 0 ) {
				System.out.println(i);
			}
			
		}
		
		for(int i = 100 ; i>1 ; i--) {
			
			System.out.println(i);
		}
		
		for (int i = 100 ; i > 21 ; i--) {
			
			int j = 0;
			
			if(i%2 == 1 ) {
				System.out.println(i);
			}
		}
		
	}
}
	