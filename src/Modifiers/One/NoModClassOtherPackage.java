package Modifiers.One;

import Modifiers.NoModCass;

public class NoModClassOtherPackage {

	public static void main(String[] args) {
		NoModCass  nm= new NoModCass ();
		
		nm.publicPrint();
		nm.protectedPrint();
		nm.noModPrint();
		nm.privatePrint();
	
	
		}
}
