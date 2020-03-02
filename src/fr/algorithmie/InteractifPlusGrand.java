package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int tableauDesEntree[] = new int [10];
		
		Scanner saisie = new Scanner(System.in);
																										//invite l'utilisateur à saisir un nombre 10 fois
		System.out.println("Choisir un nombre entier 10 fois");
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println("Quel est votre chiffre "+(i+1)+" ?");
			tableauDesEntree[i] = saisie.nextInt();
		}
																										//affiche les valeurs saisies
		System.out.print("les valeurs rentrée sont :");
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.print("["+tableauDesEntree[i]+"]");
		}

	}

}
