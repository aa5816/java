import java.util.Scanner;

public class Example8 {
	private static Scanner scan;
	public static void main(String[] args)
	{ int s=0;
	   scan = new Scanner(System.in);
	   int[] a = new int[10];
	   System.out.println("Enter 10 variables: ");
	   for(int i = 0; i < a.length; i++) {
		  
		   a[i] = scan.nextInt();
		 s+=a[i]*a[i];
	      }
	   System.out.println("some of sqaures of series is "+s);
	  
	}
}
