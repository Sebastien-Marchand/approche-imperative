package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int laSommeDesChiffres =0;
																									//invite l'utilisateur à saisir un nombre
		System.out.println("Choisir un nombre entier\n Quel est votre chiffre ?");
		int nb = saisie.nextInt();
		System.out.println("Votre chiffre est donc:"+nb);

		for(int i = 0 ; i < nb ; i++)																//calcule la suite jusqu'au nombre désiré et l'additionne
		{
			laSommeDesChiffres = laSommeDesChiffres + i;
		}
		laSommeDesChiffres = laSommeDesChiffres + nb;
		
																									//Affiche le résultat
		System.out.println("La somme Arithmetique est : "+laSommeDesChiffres);
	}

}
