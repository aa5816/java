package sh_area;
import java.util.Scanner;

class shape extends Thread{
private static Scanner scan;
  public static int a,b; public void run () { }
public static void main (String[] args)
{ shape ob;
  circle ci= new circle ();  
triangle t= new triangle (); 
 rectangle r= new rectangle ();
ob=ci; 
System.out.println (" enter radius");  
                 
                  scan = new Scanner(System.in);
                  a= scan.nextInt();
                 ob.start (); 

                 
ob=t;
 System.out.println (" enter base and height");
                 
                 scan = new Scanner(System.in);
                  a= scan.nextInt();
                  b=scan.nextInt();
                  ob.start ();

                  
ob=r;
 System.out.println (" enter length and breadth");
                  
                   scan = new Scanner(System.in);
                  a= scan.nextInt();
                  b=scan.nextInt();
                 ob.start ();
                   
                   

}

}
  
class triangle extends shape
{      
    public void run ( )
 {     System.out.println ("area is "+(0.5*a*b)); System.out.println(Thread.currentThread().getId()); }
 
}

class rectangle extends shape
{      
    public void run ( )
 {     System.out.println ("area is "+(a*b)); System.out.println(Thread.currentThread().getId()); }
 
}

class circle extends shape
{      
    public void run ( )
 {     System.out.println ("area is "+(3.14*a*a)); System.out.println(Thread.currentThread().getId()); }
 
}

