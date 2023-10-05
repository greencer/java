package Bienvenu;

import java.util.Scanner;

public class Nombre {
	
	public static void main(String[] args){
		int i;
		boolean b=true;
		
		do{
		System.out.println("Donnez un entier positif et <1000: ");
		Scanner input=new Scanner(System.in);
		 i=input.nextInt();
		if(i<1000 && i>0){
			b=false;
		}
		 //while true la boucle continue a fonctionner
		} while(b);
		
		int centaines = i/100;
		int dizaines = (i/10)%10;
		int unites = i%10;
		System.out.println("unités: "+unites+" Dizaines: "+dizaines+" Centaines: "+centaines);	

	}// 


}
