package edunova;

public class E01Operatori {
	
	public static void main(String[] args) {
		
		int i=2, j=4; //zamislimo da je pomoću Joptionpane korisnik svaki puta unio ove vrijednosti
		int rezultat = i+j;
		System.out.println(rezultat);
		// - * / 
		
		// modulo % ostatak nakon cijelobrojnog djeljenja /
		
		i = 9%2;
		System.out.println(i); 
		System.out.println("---------------");
		rezultat = rezultat+1;
		rezultat+=1; // ista stvar
		
		rezultat = rezultat+i;
		rezultat+=i; // ista stvar
		System.out.println(i);
		
		//++ --
		
		// uvečanje za 1
		
		i= i+1; //1. način
		
		i+=1; // drugi način
		System.out.println(i);
		i++; // treći način -- prvo se koristi vrijednost pa se uveča
		System.out.println(i);
		++i; // prvo se uveća pa se koristi vrijednost
		System.out.println(i);
		
	}

}
