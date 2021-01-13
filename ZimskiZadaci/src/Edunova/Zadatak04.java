package Edunova;

import java.util.Arrays;
import java.util.Scanner;


public class Zadatak04 {
	
	public static void main(String[] args) {
		
		int a[][] = new int [4][4];
		int b[][] = new int [4][4];
		int sum[][] = new int [4][4];
		Scanner scanner = new Scanner(System.in);
		
		int i,j;
		
		System.out.println("Unesite elemente matrice a: ");
		
		for(i = 0; i < 4 ; i++) {
			for(j = 0; j<4 ; j++) {
			
			a[i][j] = scanner.nextInt();
			
			}
			
		}
		
		System.out.println("Unesite elemente matrice b: ");
		
		for(i = 0; i < 4 ; i++) {
			for(j = 0; j<4 ; j++) {
			
			b[i][j] = scanner.nextInt();
			
			}
			
		}
		
		for(i = 0; i < 4 ; i++) {
			for(j = 0; j<4 ; j++) {
			
			sum[i][j] = a[i][j]+b[i][j];
			
			}
			
		}
		System.out.println("Zbroj vaših matrica je : " + Arrays.deepToString(sum));
	}
	
}