package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
											//d�claration variable
		byte monbyte = 1;
		short monshort = 2;
		int monint = 3;
		char monchar = 'A';
		boolean monbool = true;
											//Les litteraux sp�cifiques
		long monlong = 1_000_000l;
		float monfloat = 1.0f;
		double mondouble = 2.0d;
											//Affichage des valeurs d'une variable
		System.out.println("Monbyte: " +monbyte+"\nMon short: " +monshort+"\nMonint: "+monint+"\nMonlong: " +monlong
				+"\nMonfloat: " +monfloat+"\nMondouble: "+mondouble+ "\nMonchar: "+monchar+"\nMonbool: "+monbool+"\n\n");
		
											//retour a la ligne du caract�re
		
		String randomString = "Voici le r�sultat d�un calcul :\n 1+5=6";
		System.out.println(randomString);
	}

}
