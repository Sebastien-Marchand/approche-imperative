package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int tableau[] = {0, 12, 17, 14, 5, -9, 0, 6 } ;
		boolean controleStatue = false;
		
		if(tableau.length > 1 && tableau[0] == 6 || tableau.length > 1 && tableau[tableau.length-1 ] == 6)
		{
			controleStatue = true;
		}
		System.out.println("Le premier ou dernier élément est 6?\n statue :" +controleStatue);
	}

}
