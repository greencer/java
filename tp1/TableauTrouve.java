package Bienvenu;

import java.util.Scanner;

public class TableauTrouve {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("donner n la taille du tableau");
		int n=input.nextInt();
		
		int[] tab=new int[n];
		System.out.println("Remplissage Tableau");
		for(int i=0;i<n;i++) {
			tab[i]=input.nextInt();
		}
		System.out.println("donner x");
		int x=input.nextInt();
		int pos=-1;
		for(int i=0;i<n;i++) {
			if(tab[i]==x) {
				pos=i;
				break;
			}
		}
		System.out.println("la position de x est "+pos);

	}

}
