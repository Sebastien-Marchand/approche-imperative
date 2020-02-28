package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tailleTableau = array.length;																		//taille tableau array
			
																												// Affiche l'ensemble du tableau
		System.out.println("\t \\---Affichage dans l'ordre si supérieur à 3:\t---/\n");
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			if(array[i]> 3)																						//seulement si supérieur à 3
			{
				System.out.println("la case "+ i +" est égale a :"+ array[i]);
			}
			else 
			{
				System.out.println("\t\t\tLa case "+ i +" ne respect pas les condition d'être supérieur a 3");	//retour d'érreur
			}
	
		}
		
		System.out.println("\n\t \\---Affichage dans l'ordre les entier paire:\\t---/\\n");									//Affiche l'ensemble du tableau
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			if(array[i]%2 == 0 )
			{
				System.out.println("la case "+ i +" est égale a :"+ array[i]);									//Affiche si le résultat est pair
			}
			else 
			{
				System.out.println("\t\t\tLa case "+ i +" ne respect pas les condition d'être pair");
			}
	
		}
		
		System.out.println("\n\t \\---Affichage dans si l'index est un entier paire:\\t---/\\n");									//Affiche l'ensemble du tableau
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			if(i%2 == 0 )
			{
				System.out.println("la case "+ i +" est égale a :"+ array[i]);									//Affiche si l'index est pair
			}
			else 
			{
				System.out.println("\t\t\tL'index de la case "+ i +" ne respect pas la condition d'être pair");
			}
	
		}
		
		System.out.println("\n\t \\---Affichage dans l'ordre les entier impaire:\\t---/\\n");									//Affiche l'ensemble du tableau
		for (int i = 0 ; i < tailleTableau ; i++)
		{
			if(array[i]%2 != 0 )
			{
				System.out.println("la case "+ i +" est égale a :"+ array[i]);									//si le résultat est impair
			}
			else 
			{
				System.out.println("\t\t\tLa case "+ i +" ne respect pas les condition d'être impair");
			}
	
		}
	}

}
