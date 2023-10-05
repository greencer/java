package Bienvenu;

import java.util.Scanner;

public class SommeRacineCarre {
	public static void main(String[] args){

		//somme Square carree
			int nombre;
			boolean execution=true;
			float somme=0;

			System.out.println("Donnez un entier positif ");

		do{
			Scanner input=new Scanner(System.in);
			nombre=input.nextInt();
			if (nombre==0) {
				execution=false;
				
			}else if (nombre<0) {
				System.out.println("L'entier doit etre positif");
				 
			}else {
				somme+=Math.sqrt(nombre);
				
			}
			
		}while(execution);

		
		System.out.println("La somme des racines des entiers positifs est : "+somme);


	}


}
