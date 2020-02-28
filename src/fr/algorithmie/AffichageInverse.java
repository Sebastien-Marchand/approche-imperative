package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {


		int array[] = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;		//Mon tableau
		int tailleTableau = array.length;												//taille tableau array
		
		int arraycopie[] = new int[array.length];										//Mon tableau copié
													// Affiche l'ensemble du tableau
		System.out.println("\t Affichage dans l'ordre:\n");
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			System.out.println("la case "+ i +" est égale a :"+ array[i]);
		}
		
													//affiche l'ensemble du tableau dans l'ordre inverse
		System.out.println("\t Affichage dans l'ordre inverse:\n");
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			System.out.println("la case "+ i +" est égale a :"+ array[tailleTableau - i -1]);
		}
													//copié un tableau a partir du premier
		for (int i = 0 ; i < tailleTableau ;i++)
		{
			arraycopie[i] = array[i];
		}
		
				// Affiche l'ensemble du tableau inversé
		System.out.println("\t Affichage dans l'ordre de la copie:\n");
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			System.out.println("la case "+ i +" est égale a :"+ array[i]);
		}
	}

}
