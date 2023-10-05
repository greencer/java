package Bienvenu;

import java.util.Scanner;

public class TableauFusion {
public static void main(String[] args){

		
		int[] A;
		int[] B;
		int[] C;
		int a,b,c,n;

		System.out.println("Donnez la taille du premier tableau ");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		A=new int[a];


		for (int i=0;i<A.length;i++ ) {
			//System.out.println("Donnez un entier");
			n=input.nextInt();
			A[i]=n;
		}

		System.out.println("Donnez la taille du deuxieme tableau ");
		
		b=input.nextInt();
		B=new int[b];


		for (int i=0;i<B.length;i++ ) {
			//System.out.println("Donnez un entier");
			n=input.nextInt();
			B[i]=n;
		}

		// fusion de deux tableaux

		C=new int[a+b];
		
			for (int j=0; j<A.length;j++ ) {
				C[j]=A[j];
			}

			for (int i=0;i<b;i++ ) {
				C[i+a]=B[i];
		
			}

		// Affichage du contenu de trois tableaux
		for (int i=0;i<A.length;i++ ) {
		
			System.out.print("|"+A[i]);
			
		}
		System.out.println(" ");
		for (int i=0;i<B.length;i++ ) {
		
			System.out.print("|"+B[i]);
			
		}
		System.out.println(" ");
		for (int i=0;i<C.length;i++ ) {
		
			System.out.print("|"+C[i]);
			
		}


}//


}
