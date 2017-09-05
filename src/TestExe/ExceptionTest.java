package TestExe;

	import java.io.*;
	public class ExceptionTest{
		

	static double a[];
	
	 public static void main(String[] args) {
	 
		a=new double [4];
		
		try{
		printElement(1);
		}catch (ArrayIndexOutOfBoundsException e)
		{
		
			System.out.println("Stop");
			
		}
		
		
	 }

	private static void printElement(int i) {
		System.out.println(a[i]);
	}
	
	}

