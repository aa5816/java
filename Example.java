import java.util.Scanner;

public class Example {
	private static Scanner scan;
	public int iop (int x,int y,int z)
{ 
	if (x>y && x>z)
		return x;
	else if (y>x && y>z)
		return y;
	else
		return z;}

public static void main(String[] args)
{ 
   scan = new Scanner(System.in);
   int[] a = new int[3];
   System.out.println("Enter 3 variables: ");
   for(int i = 0; i < a.length; i++) {
	  
	   a[i] = scan.nextInt();
	 }
   Example ob = new Example ();
  int k= ob.iop(a[0],a[1], a[2]);
  System.out.println("biggset integer is");
  System.out.println(k);
 }
}
