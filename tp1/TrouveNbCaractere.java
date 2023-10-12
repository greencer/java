package Bienvenu;

import java.util.Scanner;

public class TrouveNbCaractere {
	public static void main(String[] args) {
		// write your code here
		Scanner input = new Scanner(System.in);
		String s;
		char c;
		int count=0;
		System.out.print("Entrez une chaine de caracteres: ");
		s=input.nextLine();
		System.out.print("Entrez un caractere: ");
		c=input.next().charAt(0);
		for (int i=0; i<s.length();i++ ) {
		if (s.charAt(i)==c) {
		count++;
		}
		}
		System.out.print(c+" apparait "+count+" fois dans : "+s+"");
		}
}
