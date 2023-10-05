package Bienvenu;

import java.util.Scanner;

public class NbPremier {
	
	public static void main(String[] args){


		// Table multiplication
		System.out.println("Donnez un entier ");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt(); 

		
		for(int i = 2; i<=number;i++){
	         int premier = 1;
	         for(int j = 2; j <=i; j++) {
	            if((i % j) == 0 && j!=i) {
	               premier = 0;
	            }
	         }
	         if (premier != 0)
	        	 System.out.print(i+" ");
	         
	      }

		
		

	}// fin main


}
