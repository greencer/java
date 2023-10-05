package Bienvenu;

import java.util.Scanner;

public class Annee {
	/*Annee bissextille 
	« multiple de 4 mais pas de 100 ou multiple de 400 »
	•	Si une année est divisible par 4 signifie qu’il n’y a pas de reste. S’il n’est pas divisible par 4. Ce n’est pas une année bissextile. Par exemple: 1997 n’est pas une année bissextile.
	•	Si une année est divisible par 4, mais pas par 100. Par exemple: 2012, c’est une année bissextile. Si une année est divisible par 4 et 100, passez à l’étape suivante.
	•	Si une année est divisible par 100, mais pas par 400. Par exemple: 1900, alors ce n’est pas une année bissextile. Si une année est divisible par les deux, alors c’est une année bissextile. 2000 est donc une année bissextile.
	 */

	public static void main(String[] args) {
		int annee;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Annee: ");
			annee=input.nextInt();
		}while(annee<1000||annee>2050);
		
		if(annee %4==0 && (annee %100!=0 || annee %400==0)){
			System.out.println(annee+" bissextile \n");
		}
		else{
			System.out.println(annee+" n'est pas bissextile\n");
		}
		
	}
}
