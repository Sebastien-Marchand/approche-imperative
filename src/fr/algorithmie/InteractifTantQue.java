package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int nb = 0;
																								//invite l'utilisateur � saisir un nombre entre 1 et 10
		System.out.println("Choisir un nombre entier entre 1 et 10");

		do {
			System.out.println(" Quel est votre chiffre ?");
			nb = saisie.nextInt();
			
			if(nb < 1 || nb > 10)																//indique a l'utilisateur le non respect de la consigne
			{
				System.out.println("Le chiffre choisie ne respect pas la consigne.\n choisir un chiffre entre 1 et 10");
			}
			
		}while(nb < 1 || nb > 10);
		
		System.out.println("Votre chiffre est donc:"+nb+"\n\tfin du programme.");

	}

}
