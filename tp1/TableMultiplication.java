package Bienvenu;

import java.util.Scanner;

public class TableMultiplication {
	public static void main(String[] args){


		// Table multiplication
		System.out.println("Donnez un entier ");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt(); 

		if (number>=0) {
			for(int i=0;i<=9;i++) {
				
				System.out.println(number+"*"+(i+1) +"= "+number*(i+1));
			}
			
		} else {
			System.out.println("enter a positive number");
		}

		
	
	}


}
