package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		int tableau1[] = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tableau2[] = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;

		if(tableau1.length == tableau2.length)													//compare les tailles des deux tableaux
		{
			System.out.println("\tCalcul somme deux tableau\n");

			int[] sommeTableau = new int[tableau1.length];										//créer un tableau somme de taille identique
			for(int i = 0 ; i< tableau1.length ; i++)											//additionne les valeurs des deux tableau et
			{																					//les place dans une variable.
				sommeTableau[i] = tableau1[i] + tableau2[i];
				System.out.println("la somme des 2 tableau donne sommeTableau["+i+"]:" +sommeTableau[i]);
			}
			
			System.out.println("\t---Fin des calculs---");

		}
		
	}

}
