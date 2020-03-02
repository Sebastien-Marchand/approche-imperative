package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tailleTableau = array.length;												//taille tableau array
		float totalTableau = 0f;
		float moyenneTableau = 0f;
													// Affiche l'ensemble du tableau
		System.out.println("\t Calcule de la moyenne du tableau\n");
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			totalTableau = totalTableau+array[i];
		}
		moyenneTableau = totalTableau/tailleTableau;
		System.out.println("\tLa valeur moyenne des éléments du tableau est:"+moyenneTableau+"\n");


	}

}
