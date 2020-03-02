package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int tableau[] = {4,3,6,1,4};																		//le tableau
		boolean controleStatue = false;																		//Le controleur boolean
		
		if(tableau.length > 1 && tableau[0] == tableau[tableau.length-1 ])									//si 1st et last sont identique et la taille sup a 1
		{
			controleStatue = true;
		}
		System.out.println("Le premier ou dernier élément est 6?\n statue :" +controleStatue);

	}

}
