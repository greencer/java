package Bienvenu;

import java.util.Scanner;

public class Jour {

	public static void main(String[] args){
		String[] jours={"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};

		System.out.println("jour: ");
		Scanner input=new Scanner(System.in);
		int j=input.nextInt();
		
		if (j>=1 && j<= 7)
		{
		System.out.println("C'est: "+jours[j-1]);
		}
		else {
		System.out.println("Donnez une position entre 1 et 7");
		}


	}// fin main
	}// fin class
