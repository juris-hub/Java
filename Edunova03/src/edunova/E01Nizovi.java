package edunova;

import java.util.Arrays;

public class E01Nizovi {
	
	public static void main(String[] args) {
		//potreba za pohranom više vrijednosti istog tipa
		//želim pohraniti temperature u zadnjih 12 mjeseci
		
		//deklaracija
		int niz[];
		
		// inicijalizacija
		
		niz = new int	[12];
		int polje [] = {1, 2 , 3 ,4};
		
		int mjeseci []	= new int[12];
		char konstante [] = {'A', 'B', 'C'};
 		
		System.out.println(konstante[1]);
		
		int tablica [][] = new int [5][5];
		
		tablica [0][0] = 2;
		tablica [1][1] = 2;
		tablica [2][2] = 2;
		tablica [3][3] = 2;
		tablica [4][4] = 2;
		
		System.out.println(Arrays.toString(tablica[0]));
		System.out.println(Arrays.toString(tablica[1]));
		System.out.println(Arrays.toString(tablica[2]));
		System.out.println(Arrays.toString(tablica[3]));
		System.out.println(Arrays.toString(tablica[4]));
		}
}
