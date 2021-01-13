package edunova;

public class E02ForPetlja {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++) {
			
			System.out.println("Osijek");
			
		}
		for (int i = 0; i < 10 ; i++) {
			
			System.out.println(i);
		}
		int zbroj = 0;
		for (int i = 1; i<=100;i++) {
			
			zbroj+=i;
			System.out.println(i);
		}
		
		// mogućnost preskakanja koraka / nastavljanje izvođenja
		
		for (int i = 0; i < 10 ; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("broj je : " + i );
		}
		
		// mogućnost nasilnog prekida petlje
		
		for (int i = 0; i < 10 ; i++) {
			if(i == 6) {
				break;
			}
			System.out.println("broj je: " + i);
		}
		
		for (;;) {
			System.out.println(Math.random());
		
		}
	}

}
