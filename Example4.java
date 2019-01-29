import java.util.Scanner;
public class Example4 {
	private static Scanner scan;
	
	public static void main(String args []) 
	{ int i = Integer.valueOf(args[0]);
      int j = Integer.valueOf(args[1]);
      int s = 0;
      System.out.println("1.ADD,2.SUBTRACT,3.MULTIPLY,4.DIVIDE");
      scan = new Scanner(System.in);
        int c = scan.nextInt();
	if (c==1)
	{	s=i+j; System.out.println(" result is " +s);
	}	
	else if (c==2)
	{
		s=i-j; System.out.println(" result is " +s);
	}
	else if (c==3)
	{
		s=i*j; System.out.println(" result is " +s);
	}
	else if (c==4)
	{
		s=i/j; System.out.println(" result is " +s);
	}
	else
		System.out.println("invalid option");	
	}
	
}
