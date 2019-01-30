abstract class shape 
{ abstract void u ();
    public static void main (String[] args)
     { triangle ob= new triangle ();
        ob.u();
        rectangle ob1= new rectangle ();
        ob1.u();
        circle ob2= new circle ();
        ob2.u();}
}

class triangle 
{ void u ()
    { System.out.println ("tr");}
}

class rectangle 
{ void u ()
    { System.out.println ("rect");}
}

class circle 
{ void u ()
    { System.out.println ("cr");}
}
