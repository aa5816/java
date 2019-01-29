import java.util.Scanner;

public class Example6 {
	private static Scanner scan;
	public static void main(String[] args)
	{ 
	   scan = new Scanner(System.in);
	   int[] a = new int[10];
	   System.out.println("Enter 10 marks : ");
	   for(int i = 0; i < a.length; i++) {
		  a[i] = scan.nextInt(); }
	   Example6 u = new Example6 ();
	   u.sort(a);
	   u.print(a);
	   }
	
	public void sort (int[] x) //insertion sort
	{  int i,j,t;
		 for (i=0;i<x.length;i++)
		    {  for (j=i;j>0;j--)
		           { if (x[j]<x[j-1])
		               { t=x[j-1]; x[j-1]=x[j]; x[j]=t;}
		 
		            }
		     }
	}
    
	public void print (int[] x)
    { String[] g = new String[10];
          
		for(int i = 0; i < x.length; i++) 
     {
    		if (x[i]<=40)
    		{ g[i]="fail"; }
    		
    		else if (x[i]>40 && x[i]<=50)
    		{	
    			g[i]="pass";
    		}
    		
    		else if (x[i]>50 && x[i]<=75)
    		{	g[i]="merit";
    		}
    		else
    		{	g[i]="distinction"; }
    		System.out.println("sn	marks	grade");
    		System.out.println(i+1+" 	"+x[i]+" 	"+g[i]);
    }
    }
}
