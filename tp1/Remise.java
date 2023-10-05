package Bienvenu;

import java.util.Scanner;

public class Remise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remise,montant;
			System.out.println("Donnez un montant: ");
			Scanner input=new Scanner(System.in);
			 montant=input.nextInt();

			if (montant <50000) {
		        System.out.println("remise 20%");
		        remise=(montant*20)/100;// montant*0.2
		        System.out.println("montant à payer: "+(montant-remise));
		   	
			 } else if (50000<=montant  && montant < 150000 ){
		        System.out.println("remise 40%");
		        remise=(montant*40)/100;
		        System.out.println("montant à payer: "+(montant-remise));
		    	} 
			else if(montant>= 150000){
				System.out.println("remise 60%");
				remise=(montant*60)/100;
				System.out.println("montant à payer: "+(montant-remise));
			} 
		
	
	}

}
