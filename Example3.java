import java.util.Scanner;
public class Example3 {
	private static Scanner scan;

	public void fib (int n)
	{
		int i=0; int f=0; int s=1; int t=0;
		System.out.println (" fibonacci series is");
		System.out.println (f);
		System.out.println (s);
		for (i=3;i<n;i++)
		{ t=f+s; System.out.println (t); f=s; s=t;}
		}

	public static void main(String[] args)
{ scan = new Scanner(System.in);
  int i = scan.nextInt();
   Example3 ob = new Example3 ();
   ob.fib(i);
}

	
}
