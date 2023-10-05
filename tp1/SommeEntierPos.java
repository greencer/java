package Bienvenu;

import java.util.Scanner;

public class SommeEntierPos {
	public static void main(String[] args){


		// somme des entiers positifs
	  System.out.println("somme des entiers positifs");
	  System.out.println("Donner un  ensemble d'entiers ");
		Scanner input=new Scanner(System.in);
		String[] mots; //time
		String chaine=input.nextLine();  
		mots=chaine.split(" "); 
	  int somme=0;
	  for(int i=0; i< mots.length;i++){
	    int number=Integer.parseInt(mots[i]);;
	    if(number>=0){
	      somme=somme+number;
	    }
	    
	  }
	  
	  System.out.println("Somme: "+somme);
		
		

	}


}
