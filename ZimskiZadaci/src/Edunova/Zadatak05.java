package Edunova;
import java.util.*;
public class Zadatak05 {
	public static void main(String args[])
    {
		
        int A[][] = new int[5][5];
        int k=1, c1=4, c2=0, r1=4, r2=0;

        while(k<=25)
            {
                for(int i=c1; i >= c2;i--) {
                    A[r1][i]=k++;
                }
                
                for(int i =r1 - 1 ; i >= r2 ; i-- ) {
                	
                	A[i][c2] = k++;
                }
                
                for (int i = c2 +1 ; i <= c1 ; i++) {
                	
                	A[r2][i] = k++;
                }
                
                for ( int i = r2 + 1 ; i <= r1 - 1 ; i++) {
                	
                	A[i][c1] = k++;
                }
                
                for ( int i = c1 - 1 ; i >= c2 + 1; i--) {
                	
                	A[r1-1][i] = k++;
                }
                
                for(int i =r1 - 2 ; i >= r2 + 1 ; i-- ) {
                	
                	A[i][c2+1] = k++;
                }
                
                for (int i = c2 +2 ; i <= c1 - 1 ; i++) {
                	
                	A[r2+1][i] = k++;
                }
                
                for ( int i = r2 + 2 ; i <= r1 - 2 ; i++) {
                	
                	A[i][c1-1] = k++;
                }
                
                for(int i=c1 - 2; i >= c2 + 2 ; i--) {
                    A[r1-2][i] = k++;
                }

        System.out.println("Cirkularna matrica : ");
        for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                    {
                        System.out.print(A[i][j]+ "\t");
                    }
             System.out.println();
            }
    }
}
}