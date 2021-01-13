package Edunova;

public class Zadatak01 {
	public static void main(String[] args) {
		
	int array[] = {1, 2, 3 , 4, 5, 6 , 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,24};
	int i = 0;
	int min = array[i] , max = array[i], sum = 0;
	for(int j = 0; j<array.length; j++) {
			
			sum = sum + array[j];
		if(min>array[j]) {
			min = array[j];
			}
		else if(array[j] > max) {
			max = array[j];
			}
		}
	System.out.println("Zbroj je: " + sum);
	System.out.println("Najmanji uneseni broj je: " + min);
	System.out.println("Najveci uneseni broj je: " + max);
		
	}
}
