package Edunova;

public class Zadatak02 {
	public static void main(String[] args) {
		int i, j;
		
		for(i=0;i<=15;i++) {
			for(j=0;j<=15;j++) {
				
				System.out.printf("%4d", (i*j));
			}
			System.out.println();
		}
	}
}
