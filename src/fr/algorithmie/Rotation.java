package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int tableau[] = {0,1,2,3};
		int temp = 0;
												//---------Affichage avant d�placement---------\\
		
		System.out.print("le tableau avant d�placement vaut : ");
		for(int i = 0 ; i< tableau.length ; i++)
		{
			System.out.print("["+tableau[i]+"]");
		}
		System.out.println();
		
												//---------D�placement de tout les �l�ments vers la droite---------\\
		
		for(int i = tableau.length-1  ; i > 0 ; i--)								//parcour tout le tableau de la fin jusqu'a l'avant dernier
	{																				//et inverse l'emplacement parcouru par n-1
			temp = tableau[i];
			tableau[i] =  tableau[i-1];
			tableau[i-1] =  temp;
		}
		
												//---------Affichage apr�s d�placement---------\\
		
		System.out.print("le tableau apr�s d�placement vaut : ");
		for(int i = 0 ; i< tableau.length ; i++)
		{
			System.out.print("["+tableau[i]+"]");
		}
		System.out.println();
	}

}
