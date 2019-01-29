import java.util.Scanner;

public class Example5 {
	private static Scanner scan;   
	
	public static void main(String[] args)
	{ System.out.println(" input an integer for its reverse");
	  scan = new Scanner(System.in);
	   int i = scan.nextInt();
	   Example5 ob = new Example5 ();
	   ob.ren(i);
	}
	
	
	public void ren (int x)
   {  int j=0;
     int d=0;
     while (x!=0)
     { d=x%10;
        j=j*10 + d;
        x=x/10;
        }
     System.out.println(" reverse is "+j);
   }
}

