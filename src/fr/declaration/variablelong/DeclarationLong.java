package fr.declaration.variablelong;

public class DeclarationLong {

	public static void main(String[] args) {
		long a = 3000l;
		long b = 3000;
		System.out.println("a :"+a+"\tb :"+b);

					//Il n'y a aucune diff�rence d'affichage
		long c = 3000000000l;
		System.out.println("c : "+c);
		/**
		 *	Sans le L ( ou l) il n'est pas possible, car le c'est d�clarer comme un entier et non un long	
		 *	Un l ou L n'a aucun incidence sur la d�claration de la variable
		 *	Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 *	The literal 3000000000 of type int is out of range
		 *	at fr.declaration.variablelong.DeclarationLong.main(DeclarationLong.java:11)
		 */
	}

}
