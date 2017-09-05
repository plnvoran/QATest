package TestExe;

public class CatchExceptionTest {

	static int a[];

	public static void main(String args[]) {
		int x=100;
		int y=0;
		
		int n=0;
		a = new int[4];
		
	
		try {
			a[0]=2147483647+10;
			} catch(Exception e2){
				System.out.println(e2);
			}
	
		
		
		a[1]=x-y;
		a[2]=x*y;
	
		
		try {
		a[3]=x/y;
		} catch(java.lang.ArithmeticException e1){
			System.out.println("Deviding by zero");
		}
		
		try {
			printElement(n);
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handle exception of type ArrayIndexOutOfBoundsException
			System.out.println("Catch exception :" + e);
		} 
		
		
		
		finally {
			System.out.println("End of test");
	    }
	}

	static void printElement(int i) {
		   
		   System.out.println("The element N"+i+" is :" + a[i]);
		}

}
