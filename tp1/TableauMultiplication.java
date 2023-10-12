package Bienvenu;

import java.util.Scanner;

public class TableauMultiplication {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("donner la taille de A");
		int n=input.nextInt();
		System.out.println("donner la taille de B");
		int p=input.nextInt();
		int max = Math.max(n,p);
		int[] A=new int[n];
		int[] B=new int[p];
		int[] C=new int[max];
		System.out.println("Remplissage de A");
		for(int i=0;i<n;i++) {
			A[i]=input.nextInt();
		}
		System.out.println("Remplissage de B");
		for(int i=0;i<p;i++) {
			B[i]=input.nextInt();
		}
		int min = Math.min(n, p);
		for(int i=0;i<min;i++) {
			C[i]=A[i]*B[i];
		}
		int k=n;
		if(n<p) {
			for(int i=n;i<p;i++) {
				C[i]=B[k];
				k++;
			}
		}
		else {
			for(int i=p;i<n;i++) {
				C[i]=A[i];
			}
		}
		for(int i=0;i<max;i++) {
			System.out.print("|"+C[i]);
		}
	}

}
