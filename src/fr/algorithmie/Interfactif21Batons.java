package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		int randomPieces = new Random().nextInt(2);
		int randomInt = 0;
		int nbBaton = 21;
		int decisionUser = 0;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Bienvenue dans le jeu des 21 baton !\n");
		System.out.println("Règlement : \n\tCelui qui prend le dernier baton a perdu"
				+ "\n\tpossibilité de retiré jusqu'à 3 batons\n\tAppuyer sur une touche pour démarrer");
					decisionUser = saisie.nextInt();
					if(randomPieces == 0)
					{
						System.out.println("L'ordinateur commence.");
					}
					else if(randomPieces == 1) {
						System.out.println("Vous commencé !");
					}
		do {
			if(randomPieces == 1)
			{
														//---Action du joueur---\\
				do {
					System.out.println("Choisir le nombre de baton à retiré :");
					decisionUser = saisie.nextInt();
					if(decisionUser > 0 && decisionUser <=3)
					{
						nbBaton = nbBaton - decisionUser;
						System.out.println("Il reste :"+nbBaton+" batons");
					}
					else
					{
						System.out.println("vous essayer de triché !");
					}
				}while(decisionUser < 1 || decisionUser > 3);
				randomPieces = 0;
			}
			else
			{
														//---Action de l'ordinateur---\\
				if( nbBaton > 6 )
				{
					randomInt = new Random().nextInt(3)+1;
				}
				else if( nbBaton > 1 )
				{
					switch( nbBaton ) 
					{
						case 2 :
							randomInt = 1;
							break;
						case 3:
							randomInt = 2;
							break;
						case 4:
							randomInt = 3;
							break;
						case 5:
							randomInt = 1;
							break;
						case 6:
							randomInt = 1;
							break;
					}
				}
				else if(nbBaton == 1)
				{
					randomInt = 1;
				}
				System.out.println("L'ordinateur retire :"+randomInt);
				nbBaton = nbBaton - randomInt;
				System.out.println("Il reste :"+nbBaton+" batons");
				randomPieces = 1;
			}
			
			
		}while(nbBaton >0);
		
		System.out.println("La partie est terminé !");
		if(randomPieces == 0)
		{
			System.out.println("L'ordinateur à gagné !");
		}
		else if(randomPieces == 1) {
			System.out.println("Vous avez gagné !");
		}
	}

}
