package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int tableau1[] = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tableau2[] = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		int tailleTableau = 0;
																								//compare les tailles des deux tableaux
																								//et récupère la taille la plus grande des deux ou identique
		if(tableau1.length >= tableau2.length)													
		{
			tailleTableau = tableau1.length;
		}
		else if(tableau1.length < tableau2.length)
		{
			tailleTableau = tableau2.length;
		}
		
			int[] sommeTableau = new int[tailleTableau];										//créer un tableau de taille nécessaire
			System.out.println("\tCalcul somme deux tableau\n");


			for(int i = 0 ; i< tableau1.length ; i++)											//additionne les valeurs des deux tableau et
			{																					//les place dans une variable
				if(i < tableau1.length && i < tableau2.length)
				{
					sommeTableau[i] = tableau1[i] + tableau2[i];
				}
				else if(i < tableau1.length)
				{
					sommeTableau[i] = tableau1[i];

				}
				else if(i < tableau2.length)
				{
					sommeTableau[i] = tableau2[i];
				}
					System.out.println("la somme des 2 tableau donne sommeTableau["+i+"]:" +sommeTableau[i]);
			}
			
			System.out.println("\t---Fin des calculs---");

	}

}
