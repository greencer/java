package Bienvenu;

import java.util.Scanner;

public class TableauZero {
public static void main(String[] args){

		
		int[] tableauZero;
		int n;
		

		System.out.println("Donnez la taille du  tableau ");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		tableauZero=new int[n];

		System.out.println("remplissage du tableau");
		
		for (int i=0;i<tableauZero.length;i++ ) {
			//System.out.println("Donnez un entier");
			n=input.nextInt();
			tableauZero[i]=n;
		}
		System.out.println(" ");
		for (int i=0;i<tableauZero.length;i++ ) {
			System.out.print("|"+tableauZero[i]);
			
		}
		System.out.println(" ");
		for (int i=0;i<tableauZero.length;i++ ) {
			if (tableauZero[i]<0) {
				tableauZero[i]=0;
			}
			System.out.print("|"+tableauZero[i]);
			
		}


}


}
