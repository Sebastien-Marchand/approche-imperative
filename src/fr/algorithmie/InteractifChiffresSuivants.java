package fr.algorithmie;
import java.util.Scanner;
;
public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
																					//invite l'utilisateur à saisir un nombre
		System.out.println("Choisir un nombre entier\n Quel est votre chiffre ?");
		int nb = saisie.nextInt();
		System.out.println("Votre chiffre est donc:"+nb);
																					//calcule a partir de la valeur demander
		System.out.println("Calculs en cours...");
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println(nb+i+1);
		}
		System.out.println("Calculs terminé.");

	}

}
