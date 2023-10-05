package Bienvenu;

import java.util.Scanner;

public class Divisible {
	
	public static void main(String[] args){
		
		System.out.println("Entier 1: ");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("Entier 2: ");
		int b=input.nextInt();	

		
		if (a%b==0){
		System.out.println(a+" est divisible par "+b);
		} else{
		System.out.println(a+" n'est pas divisible par "+b);
		} 

	}


}
