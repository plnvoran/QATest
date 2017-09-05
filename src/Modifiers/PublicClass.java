package Modifiers;

 public class PublicClass {

	public 	void publicPrint ()
	{
		System.out.print("Public class, ");
		System.out.println("Public method");
	}
	
	protected	void protectedPrint ()
	{
		System.out.print("Public class, ");
		System.out.println("Protected method");
	}
	
		void noModPrint ()
	{
		System.out.print("Public class, ");
		System.out.println("noMod method");
	}
		
		private	void privatePrint ()
		{
			System.out.print("Public class, ");
			System.out.println("Private method");
		}
		
		public static void main(String[] args) {
			PublicClass pc= new PublicClass();
			
			pc.publicPrint();
			pc.protectedPrint();
			pc.noModPrint();
			pc.privatePrint();
		
		
			}
		
}
