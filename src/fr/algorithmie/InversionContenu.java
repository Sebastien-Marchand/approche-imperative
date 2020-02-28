package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tailleTableau = array.length;												//taille tableau array

		int arraycopie[] = new int[array.length];										//Mon tableau copié

																						//affiche l'ensemble du tableau dans l'ordre inverse
		System.out.println("\t Copie dans l'ordre inverse:\n");
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			arraycopie[i] = array[tailleTableau - i -1];
		}
																						// Affiche l'ensemble du tableau
		System.out.println("Affichage dans l'ordre:\t\tAffichage dans l'ordre inverse\n");
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			System.out.print("la case "+ i +" est égale a :"+ array[i]+"\t\t");
			System.out.println("la case "+ i +" est égale a :"+ arraycopie[i]);
		}
	}

}
