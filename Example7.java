import java.util.Scanner;
public class Example7 {
	private static Scanner scan;
	public static void main(String[] args)
	{
		 scan = new Scanner(System.in);
		   int[] a = new int[3];
		   System.out.println("Enter 3 digits: ");
		   for(int i = 0; i < a.length; i++) {
			  
			   a[i] = scan.nextInt();
			 }
		   Example7 ob = new Example7 ();
		   ob.ran(a);   
	}		   
		   
	public void ran (int[] x)
		   {  for (int i=0;i<x.length;i++)
		   {
			   for (int j=0;j<x.length;j++)
			   {
				   for (int k=0;k<x.length;k++)
				   {
					   if (i!=j && j!=k && k!=i )
						   System.out.println(x[i]+""+x[j]+""+x[k]);
				   }
			   }
		   }
		   	
		   }
	

	}

