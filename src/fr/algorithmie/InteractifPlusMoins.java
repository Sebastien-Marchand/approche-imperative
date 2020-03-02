package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		int secretNb = new Random().nextInt(100)+1;
		Scanner saisie = new Scanner(System.in);
		int nb = 0;
		int nbSaisie = 0;
		do {
			nbSaisie = nbSaisie+1;
			System.out.println("Trouv� le nombre al�atoire entre 1 et 100 ?");
			nb = saisie.nextInt();
			if(nb < secretNb)
			{
				System.out.println("Vous �tes en dessous");
			}
			else if(nb > secretNb)
			{
				System.out.println("Vous �tes au dessus");
			}
		}while(nb != secretNb);
		System.out.println("Bravo vous avez trouv� en "+nbSaisie+" coups!");
		System.out.println("Fin du programme.");
		
	}

}
