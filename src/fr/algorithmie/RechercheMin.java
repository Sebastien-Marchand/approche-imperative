package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tailleTableau = array.length;
		
		int maPlusPetiteValeur = array[0];																		//initialise la 1e val du tableau
		
																												// détermine la plus petite val du tableau
		System.out.println("\t Affichage dans l'ordre:\n");														//en comparant la valeur précédente
		for (int i = 1 ; i < tailleTableau ; i++)
		{
			if (maPlusPetiteValeur > array[i])
			{
				maPlusPetiteValeur = array[i];
			}
		}
		
		System.out.println("La plus petite valeur est :"+maPlusPetiteValeur);									//Affichage de la valeur la - grande


	}

}
