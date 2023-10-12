package Bienvenu;

import java.util.Scanner;

public class TableauChaine {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("donner n");
		int n=input.nextInt();
		input.nextLine();
		String[] T=new String[n];
		int[] A=new int[n];

		for(int i=0;i<n;i++) {
			T[i]=input.nextLine();
		}
		for(int i=0;i<n;i++) {
			A[i]=T[i].length();
			System.out.println("|"+T[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.println("|"+A[i]);
		}
	}
}
