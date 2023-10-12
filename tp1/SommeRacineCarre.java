package Bienvenu;

import java.util.Scanner;

public class SommeRacineCarre {
	public static void main(String[] args){

		//somme Square carree
			int nombre;
			float somme=0;

			System.out.println("Donnez un entier positif ");
			Scanner input=new Scanner(System.in);

		do{
	
			nombre=input.nextInt();
				if (nombre>0) 
				somme+=Math.sqrt(nombre);
				else if(nombre<0)
				System.out.println("L'entier doit etre positif");
				 
			
			
		}while(nombre!=0);

		
		System.out.println("La somme des racines des entiers positifs est : "+somme);


	}


}
