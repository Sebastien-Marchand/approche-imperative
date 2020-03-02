package fr.algorithmie;

import java.util.Enumeration;
import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		int decisionUser = 0;
		int nbSaisie = 0;
		Scanner saisie = new Scanner(System.in);
		int rangN_1 = 0;
		int rangN_2 = 1;
		int valeurTemporaire = 0;																			//contient le résultat du calcul, définitif ou temporaire

		System.out.println("/---Menue du programme---\\");
		System.out.println("Calcul suite de Fibonnaci:\nQuel est le rang souhaité ?");
		System.out.println("Choisir un chiffre");
		nbSaisie = saisie.nextInt();
		if(nbSaisie == 0)
		{
			System.out.println("Résultat rang "+nbSaisie+"= "+0);
		}
		else if(nbSaisie == 1)
		{
			System.out.println("Résultat rang "+nbSaisie+"= "+1);
		}
		else
		{
			System.out.println("Cacul de la suite en cour...");
			for(int i = 0 ; i < nbSaisie ; i++)
			{
				valeurTemporaire = rangN_1 + rangN_2;
				rangN_1 = rangN_2;
				rangN_2 = valeurTemporaire;
			}
		}
		System.out.println("Resultat de la suite de Fibonnaci de rang "+nbSaisie+" = "+valeurTemporaire);
	}

}
