package Bienvenu;

import java.util.Scanner;

public class NombreSecret {
	public static void main(String[] args) {
		int x=(int)(Math.random()*11);
		Scanner input=new Scanner(System.in);
		int a;
		int s=0;
		System.out.print(x);
		do {
			System.out.print("Entrez un essai : ");
			a=input.nextInt();
			if(x<a) {
				System.out.println("Désolé c'est plus petit");
			}
			else if(x>a)  {
				System.out.println("Désolé c'est plus grand");
			}
			s++;
		}while(a!=x&&s<5);
		if(a!=x&&s==5) {
			System.out.println("Vous avez perdu!");
		}
		else {
			System.out.println("Bravo, vous avez gagné après "+s+" essais !");
		}
	}
}
