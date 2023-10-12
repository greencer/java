package Bienvenu;

import java.util.Scanner;

public class SuiteChaine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String end = "end";
        int compteur=0;
        while (true) {
            System.out.print("Saisir une chaine ou bien \"end\" to exit ");
            String ch = input.nextLine();

            if (ch.equals(end)) {
                System.out.println("Fin du programme.");
                break; 
            }else compteur++;

            System.out.println("Chaine n°"+compteur+" : " + ch);
        }
	}
}
