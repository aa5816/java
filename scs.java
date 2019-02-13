import java.util.Scanner;
public class scs 
{ private static Scanner scan,g; 
   private int code,pn;
  private String name,dept;
  public String teaching;
  void setit (int x,int y,String z,String a)
    { code =x; pn=y; name=z; dept=a; }
  String getd ()
  { return dept; }

   void printit ()
  { System.out.println ("name is "+name+" dept is "+dept+" phone numb "+pn+" deptcode is "+code+" is teaching "+teaching); }

public static void main (String[] args)
   { scs[] t = new scs [5];
      systematics s= new systematics ();
      cybernetics c= new cybernetics ();
      virtualization v = new virtualization ();
      
   System.out.println("Enter code,phone no. ,name and department of 5 teachers ");
   for(int i = 0; i < t.length; i++) {
	  t[i] = new scs ();  
          System.out.println("teacher "+(i+1)); 
	   scan = new Scanner(System.in);
           String l= scan.nextLine ();
           String a= scan.nextLine ();
           int x= scan.nextInt();
            int y= scan.nextInt();
           
           t[i].setit (x,y,l,a);
	    
         System.out.println("what wil they be teaching in 3 dept; systematics,cybernetics and virtualization");
            g = new Scanner(System.in);
            String i1= g.nextLine ();
            String i2= g.nextLine ();
            String u= g.nextLine ();
             System.out.println(" ");
           s.setit (i1); v.setit (u); c.setit (i2);
          }
   System.out.println("Enter dept for teacher ");
   scan = new Scanner(System.in);
    String z= scan.nextLine ();
   System.out.println("their info is  ");
    for(int i = 0; i < t.length; i++) {
       if (z.equals(t[i].getd ()))
        { t[i].printit (); }
     }
}
}

class systematics extends scs
{   void setit (String a)
      { teaching = a; }
}

class cybernetics extends scs
{   void setit (String a)
      { teaching = a; }
}

class virtualization extends scs
{   void setit (String a)
      { teaching = a; }
}


