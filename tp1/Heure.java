package Bienvenu;

import java.util.Scanner;

public class Heure {
	public static void main(String[] args){

		boolean b=true;
		int heures,minutes,secondes;
		
		do{
		System.out.println("Donnez le temps hh:mm:ss ");
		Scanner input=new Scanner(System.in);
		String[] mots; //time
		String chaine=input.nextLine(); 
		mots=chaine.split(":"); //La méthode split prend en entrée la chaîne à traiter et en sortie elle doit retourner le nombre de mots
		heures=Integer.parseInt(mots[0]);
		minutes=Integer.parseInt(mots[1]);
		secondes=Integer.parseInt(mots[2]);
		if(secondes<=59 && secondes>=0 &&  minutes<=59 && minutes>=0 && heures<=23 && heures>=0){
			b=false;
			
		}

		System.out.println("size "+mots.length);
		System.out.println(mots[0]);
		System.out.println(mots[1]);
		System.out.println(mots[2]);

		}while(b);

		
		// incrementation des secondes
		secondes++;
		if (secondes==60) {
			secondes=0;
			minutes++;
			if (minutes==60) {
				minutes=0;
				heures++;
				if (heures==24) {
					heures=0;
					System.out.println("Temps "+heures+":"+minutes+":"+secondes);
				}else {
						System.out.println("Temps "+heures+":"+minutes+":"+secondes);
					}
				
			}
			else {
					System.out.println("Temps "+heures+":"+minutes+":"+secondes);
				}
		}
		else {
			System.out.println("Temps "+heures+":"+minutes+":"+secondes);
		}
			 
		

	}

	
}
