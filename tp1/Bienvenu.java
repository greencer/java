package Bienvenu;

import java.util.Scanner;

public class Bienvenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("je suis un génie \n");
		System.out.print("Je sais écrire un programme \"JAVA\" ");
		Scanner input = new Scanner(System.in);
		System.out.println(" Quel est votre nom ");
		String nom = input.nextLine();
		int age=input.nextInt();
		System.out.println(" Bienvenu " + nom + "!");
		System.out.println(" vous avez " + age + " ans");
		
	}

}
