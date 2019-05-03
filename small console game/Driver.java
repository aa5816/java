
import java.io.*;
import java.util.*; import java.lang.*; import java.awt.MouseInfo;

public class Driver extends Thread

{
	static int[] x=new int[27];
	public static int j=0;
	static int x2=40;
	public static int d=0;
	static int score1=0;
	private static Scanner scan;
       

public static void main (String[] args)
{
	Driver ob= new Driver ();
	ob.start();
}


public void run()
{
	createboundary();
	createmenu();
	
}


static void createmenu() 
{
char escCode = 0x1B;
int row = 20; int column = 10;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
String intro ="WELCOME TO CATCH THATo";
int i=0;
System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT+"<<<<<");
while(intro.charAt(i)!='o'){

System.out.print(intro.charAt(i));
try
{
    Thread.sleep(100);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
i++;}
System.out.print(">>>>>");
System.out.print(ConsoleColors.RESET);

escCode = 0x1B;
row = 30; column = 15;
System.out.print(String.format("%c[%d;%df",escCode,row,column));


System.out.println(ConsoleColors.RED_BOLD+"1.PLAY GAME.....");
try
{
    Thread.sleep(500);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

escCode = 0x1B;
row = 32; column = 18;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("2.HOW TO PLAY.....");
try
{
    Thread.sleep(500);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

escCode = 0x1B;
row = 34; column = 21;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("3.CREDITS.....");
try
{
    Thread.sleep(500);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

escCode = 0x1B;
row = 36; column = 24;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("4.EXIT.....");
try
{
    Thread.sleep(500);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

int input=0;

while ((input!=1)&&(input!=2) &&(input!=1))
{scan = new Scanner(System.in);
input = scan.nextInt();
System.out.print(ConsoleColors.RESET);
switch(input)
{
case 1 : try {
		playgame();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 break;

case 2 : try {
		howplay();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 break;

case 3 : try {
		credit();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 break;

case 4 : try{
    Thread.sleep(200);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
     boundary ();
     escCode = 0x1B;
     row = 15; column = 12;
     System.out.print(String.format("%c[%d;%df",escCode,row,column));
	 System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"Byyeee !!!!!!"+ConsoleColors.RESET);
	 try
	 {
	     Thread.sleep(1000);
	 }
	 catch(InterruptedException ex)
	 {
	     Thread.currentThread().interrupt();
	 }
	 escCode = 0x1B;
	 row = 55; column = 25;
	 System.out.print(String.format("%c[%d;%df",escCode,row,column));
	 System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"TOODLES"+ConsoleColors.RESET); 
	 System.exit(0);

default : escCode = 0x1B;
          row = 10; column = 5;
          System.out.print(String.format("%c[%d;%df",escCode,row,column));
	      System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"Please enter valid choice !");
	      try
	      {
	          Thread.sleep(1000);
	      }
	      catch(InterruptedException ex)
	      {
	          Thread.currentThread().interrupt();
	      }
	      escCode = 0x1B;
	      row = 10; column =5;
	      System.out.print(String.format("%c[%d;%df",escCode,row,column));
	      System.out.println("                              ");
	      System.out.print(ConsoleColors.RESET);
              break;
	  }
}
}

static void createboundary(){
	   try {String a= RunLinuxCommand("clear"); System.out.print(a);}catch (Exception e) { }

	  char escCode = 0x1B;
	  int row = 1; int column = 1;
	  System.out.print(String.format("%c[%d;%df",escCode,row,column));

for(int x=1;x<77;x++)
{
escCode = 0x1B;
row = x; column =1;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print(ConsoleColors.CYAN+"_");
try
{
    Thread.sleep(8);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
}


for(int x=2;x<77;x++){
	escCode = 0x1B;
	row = 77; column =x;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("|");
try
{
    Thread.sleep(15);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}}

for(int x=76;x>1;x--){
	escCode = 0x1B;
	row = x; column =77;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("_");
try
{
    Thread.sleep(8);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}}


for(int x=77;x>1;x--){
	escCode = 0x1B;
	row = 1; column =x;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("|");
try
{
    Thread.sleep(15);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}}
System.out.print(ConsoleColors.RESET);
}

static void boundary()
{
	 try {String a= RunLinuxCommand("clear"); System.out.print(a);}catch (Exception e) { }

	char escCode = 0x1B;
	int row = 1; int column = 1;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));


for(int x=1;x<78;x++){
	escCode = 0x1B;
	row = x; column =1;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print(ConsoleColors.CYAN+"_");
}


for(int x=2;x<95;x++){
	escCode = 0x1B;
	row = 78; column =x;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("|");
}

for(int x=77;x>1;x--){
	escCode = 0x1B;
	row = x; column =95;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("_");
}


for(int x=95;x>1;x--){
	escCode = 0x1B;
	row = 1; column =x;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("|");
}
System.out.print(ConsoleColors.RESET);
}

static void howplay() throws IOException
{
boundary();
char escCode = 0x1B; int row = 1,column = 1;

System.out.print(ConsoleColors.BLACK_BACKGROUND);
for(int pk=2;pk<=52;pk++){
for(int ok =3;ok<=93;ok++)
{escCode = 0x1B;
row = pk; column =ok;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print(" ");
}}
System.out.print(ConsoleColors.RESET);


escCode = 0x1B;
row = 3; column = 3;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println(":::::HOW TO PLAY:::::");


System.out.print(ConsoleColors.RED_BACKGROUND);
escCode = 0x1B;
row = 8; column =8;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
//System.out.println("1.Press A to move left and D to move right. ");
System.out.println("1. Move the mouse left and right to move the @ character ");
escCode = 0x1B;
row = 10; column =8;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("2.exit by moving the mouse to the top left corner of the screen");


escCode = 0x1B;
row = 20; column =14;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("<-- mouse left                   mouse right -->");
System.out.print(ConsoleColors.RESET);


escCode = 0x1B;
row = 45; column =24;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("Press enter to return to menu.");


char ch= (char) System.in.read();
if ((int)ch==10)
{boundary();
createmenu();
}

}

static void credit() throws IOException{
boundary();
char escCode = 0x1B;
int row = 3; int column = 3;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println(ConsoleColors.RED+"::::CREDITS::::");

escCode = 0x1B;
row = 7; column =8;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
String credit= "Made by - \n\n 1.ANMOL\n";

try
{
    Thread.sleep(15);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
System.out.println(credit);

try
{
    Thread.sleep(1000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
escCode = 0x1B;
row = 18; column =6;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
String last = "All effects, designing and programming was done under professional supervision";

try
{
    Thread.sleep(15);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

System.out.println(last);
escCode = 0x1B;
row = 19; column =16;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("Please don't attempt at home!!");

escCode = 0x1B;
row = 45; column =24;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("Press enter to return to menu.");
System.out.print(ConsoleColors.RESET);
char ch= (char) System.in.read();
if ((int)ch==10)
{boundary();
createmenu();
}

}



static void playgame() throws IOException
{
	
        createdisplay();
         char escCode;
         int row,column;
int a=0;
Random rand = new Random();
double mouseX,mouseY,p=1.0 ;
//char a = 'q';
d=(rand.nextInt(6)*5)+20;
mouseX = MouseInfo.getPointerInfo().getLocation().getX(); mouseY = MouseInfo.getPointerInfo().getLocation().getY();
while(p!=0)
{ 
p=MouseInfo.getPointerInfo().getLocation().getX(); 
//a=(char)System.in.read();
if (p<=mouseX)
a=2;
else
a=3;
switch(a){
case 2 : if(x2-5>15){
	  escCode = 0x1B;
	  row = 20; column =x2;
	  System.out.print(String.format("%c[%d;%df",escCode,row,column));
	   System.out.print(" ");
	   escCode = 0x1B;  x2-=5;
	   row =20 ; column =x2;
	   System.out.print(String.format("%c[%d;%df",escCode,row,column));
	   System.out.print(ConsoleColors.BLACK_BACKGROUND+"@"); System.out.print(ConsoleColors.RESET);}
	   break;

case 3 : if(x2+5 <50){
	escCode = 0x1B;
	  row = 20; column =x2;
	  System.out.print(String.format("%c[%d;%df",escCode,row,column));
	   System.out.print(" ");
	   escCode = 0x1B; x2=x2+5;
	   row =20 ; column =x2;
	   System.out.print(String.format("%c[%d;%df",escCode,row,column));
	   System.out.print(ConsoleColors.BLACK_BACKGROUND+"@");  System.out.print(ConsoleColors.RESET);}
	   break;
	 }

update();

}
gamesave ();
}


static void createdisplay()
{
	char escCode;
        int row,column;

         boundary ();
System.out.print(ConsoleColors.BLACK_BACKGROUND);
for(int pk=2;pk<=52;pk++){
for(int ok =3;ok<=93;ok++)
{escCode = 0x1B;
row = pk; column =ok;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print(" ");
}}
System.out.print(ConsoleColors.RESET);

escCode = 0x1B;
row = 3; column =4;
System.out.print(String.format("%c[%d;%df",escCode,row,column));


System.out.println("::::PLAY GAME::::");

try {
	filehandle();
} catch (IOException e) {
	
	e.printStackTrace();
}

createboundary ();

System.out.print(ConsoleColors.BLACK_BACKGROUND);
for(int pk=2;pk<=52;pk++){
for(int ok =3;ok<=76;ok++)
{escCode = 0x1B;
row = pk; column =ok;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print(" ");
}}
System.out.print(ConsoleColors.RESET);

for(int pk=78;pk<=95;pk++){
escCode = 0x1B;
row = 1; column =pk;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print(ConsoleColors.RED+"#");
}


for(int pk=1;pk<=77;pk++)
{escCode = 0x1B;
row = pk; column =78;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("#");
}

for(int pk=78;pk<=95;pk++){
escCode = 0x1B;
row = 77; column =pk;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("#");
}

for(int pk=77;pk<=1;pk--)
{escCode = 0x1B;
row = pk; column =94;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("#");
}
System.out.print(ConsoleColors.RESET);

escCode = 0x1B;
row = 5; column =79;
System.out.print(String.format("%c[%d;%df",escCode,row,column));

System.out.println(ConsoleColors.PURPLE+" SCORE ");
System.out.print(ConsoleColors.RESET);


for(int i=1,l=0;i<53;i+=2,l++){
	escCode = 0x1B;
	row = i; column =15;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("");
escCode = 0x1B;
row = i; column =50;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("");
escCode = 0x1B;
row = i; column =32;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
x[l]=i;
System.out.println(ConsoleColors.YELLOW+"^");
System.out.print(ConsoleColors.RESET);
}
}

static void update() throws IOException
{    
	char escCode;
	int row,column;

for(int i=0;i<=24;i++)
{



System.out.print("");
escCode = 0x1B;
row = j; column =d;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("");


x[i]=x[i]+1;

if(i%5==0)j++;

if(x[i]>=49){x[i]=1;}


try
{
    Thread.sleep(10);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
escCode = 0x1B;
row = j; column =d;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("");

/*try
{
    Thread.sleep(10);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}*/

if(j == 20 && d==x2)
{
	//char a=(char)System.in.read();
	escCode = 0x1B;
	row = j; column =d;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.print("$"); 
Random rand = new Random();
d= (rand.nextInt(6)*5)+20;
j=1;
score1++;
escCode = 0x1B;
row = 10; column =82;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println(score1);
}
else if(j>=50)
{ escCode = 0x1B;
row = j; column =d;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println(" "); j=1;
Random rand = new Random();
d = (rand.nextInt(6)*5)+20;}
}
}



static void filehandle() throws IOException
{
       
       FileInputStream is = null ; ObjectInputStream ois = null;
       char escCode;
       int row,column;
    Username player=new Username ();Username old=new Username ();
    int g =0;

escCode = 0x1B;
row = 7; column =5;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("Username : ");
scan=new Scanner(System.in);
player.name=scan.nextLine();
ArrayList<Username> objectsList = new ArrayList<Username>();
try
{
    Thread.sleep(300);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
try{
is = new FileInputStream("game.ser");

boolean cont = true;

   ois= new ObjectInputStream(is);
   while(cont){
       old= (Username)ois.readObject();
      if(old != null)
       objectsList.add(old);
      else
         cont = false;}
     ois.close();
	   is.close();
     
}catch(Exception e){
   
}
  

System.out.println(objectsList.size()+" "+objectsList); 
for (int i=0;i<objectsList.size();i++)
{  if(objectsList.get(i).name.equals(player.name))
     {       escCode = 0x1B;
		row = 15; column =10;
		System.out.print(String.format("%c[%d;%df",escCode,row,column));
	     System.out.println("Previous score : "+objectsList.get(i).score);
	    g=1;
	 break;}
  }         


if(g==1)
{ escCode = 0x1B;
  row = 20; column =20;
  System.out.print(String.format("%c[%d;%df",escCode,row,column));
  System.out.println("Ready to reach new heights ?");
  char ch= (char) System.in.read();
  if (ch=='n')
  {boundary();
 createmenu();}}


else if (g==0)
{
     escCode = 0x1B;
	row = 25; column =8;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
       System.out.println("No existing usename !");
      escCode = 0x1B;
    row = 35; column =7;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("1.Create new username ? "); 
escCode = 0x1B;
    row = 36; column =7;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("2.Play as guest. ");
escCode = 0x1B;
    row = 37; column =7;
System.out.print(String.format("%c[%d;%df",escCode,row,column));
System.out.println("3.Enter another valid username.");
int n=0;

while ((n!=1)&&(n!=2)&&(n!=3))
{ n=System.in.read();
  switch (n){


case '1' :  newusername();
	    break;

case '2' : return;

case '3' : createdisplay(); break;

default : escCode = 0x1B;
          row = 40; column =20;
          System.out.print(String.format("%c[%d;%df",escCode,row,column));
	      System.out.println("Enter valid choice!");
	      try
	      {
	          Thread.sleep(1000);
	      }
	      catch(InterruptedException ex)
	      {
	          Thread.currentThread().interrupt();
	      }
	      break ;}
} }

}

static void gamesave ()
{  FileInputStream is = null ; ObjectInputStream ois = null;
   FileOutputStream fos = null; ObjectOutputStream oos=null;
ArrayList<Username> objectsList = new ArrayList<Username>();
Username old=new Username ();
try{
is = new FileInputStream("game.ser");

boolean cont = true;

   ois= new ObjectInputStream(is);
   while(cont){
       old= (Username)ois.readObject();
      if(old != null)
       objectsList.add(old);
      else
         cont = false;}
     ois.close();
	   is.close();
     
}catch(Exception e){
   
}
if (objectsList.get(0).score<score1)
objectsList.get(0).score=score1;
try 
{ fos = new FileOutputStream("game.ser");
 
oos = new ObjectOutputStream(fos); 
oos.writeObject(objectsList.get(0));
oos.close ();  fos.close ();}
catch(Exception e)
{
	e.printStackTrace();
}
boundary();
createmenu();
}

static void newusername()
{        boundary ();
	FileOutputStream fos = null; ObjectOutputStream oos=null;
     Username player=new Username (); 
     player.score =0; 
     char escCode;
	int row,column;

	escCode = 0x1B;
	row = 5; column =16;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
    System.out.println("Enter your name : ");
    scan=new Scanner(System.in);
    player.name=scan.nextLine();
   
try { fos = new FileOutputStream("game.ser");
 
oos = new ObjectOutputStream(fos); 
oos.writeObject(player);
try
{
    Thread.sleep(500);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
System.out.println("Done"); oos.close ();  fos.close (); 
try
{
    Thread.sleep(1000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
}
catch(IOException e)
{
	e.printStackTrace();
}
finally { 
createdisplay();}
}

 public static String RunLinuxCommand(String cmd) throws IOException {

    String linuxCommandResult = "";
    Process p = Runtime.getRuntime().exec(cmd);

    BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

    BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

    try {
        while ((linuxCommandResult = stdInput.readLine()) != null) {

            return linuxCommandResult;
        }
        while ((linuxCommandResult = stdError.readLine()) != null) {
            return "";
        }
    } catch (Exception e) {
        return "";
    }

    return linuxCommandResult;
} 

/*static void jaadu ()
{      int i=0; int ch=10;
	 boundary ();

	Random rand = new Random();   double m;
	char escCode;
	int row,column; 
	 
double e;
try
{
    Thread.sleep(1000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
        
while (ch>=0){

 m= 0 + (90-0) * rand.nextDouble();
 
e= Math.tan(Math.toRadians(m));
for (;i<76;i++)
        { 
          if(e*i<63 && i>=0){
          escCode = 0x1B;
	
        row = (int)(e*i); column =i;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
	System.out.print("$"); 

        
    try
{
    Thread.sleep(20);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
 escCode = 0x1B;
	
        row = (int)(e*i); column =i;

	System.out.print(String.format("%c[%d;%df",escCode,row,column));

	System.out.print(" ");
}} 




m= 0 + (90-0) * rand.nextDouble();
e= Math.tan(Math.toRadians(m));
for (i=74;i>=0;i--)
        {
          if(e*i<63){
          escCode = 0x1B;
	
        row = (int)(e*i); column =i;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
	System.out.print("^"); 
       
        
    try
{
    Thread.sleep(20);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
escCode = 0x1B;
	
        row = (int)(e*i); column =i;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
	System.out.print(" ");
}} 


    
        
  m= 0 + (90-0) * rand.nextDouble();
 
e= Math.tan(Math.toRadians(m));
for (;i<76;i++)
        { 
          if(e*i<63 && i>=0){
          escCode = 0x1B;
	
        row = (int)(e*i); column =i;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
	System.out.print("$"); 

        
    try
{
    Thread.sleep(20);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
  escCode = 0x1B;
	
        row = (int)(e*i); column =i;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
	System.out.print(" ");
}} 

m= 0 + (90-0) * rand.nextDouble();
e= Math.tan(Math.toRadians(m));
for (i=74;i>=0;i--)
        {
          if(e*i<63){
          escCode = 0x1B;
	
        row = (int)(e*i); column =i;
	System.out.print(String.format("%c[%d;%df",escCode,row,column));
	System.out.print("^"); 
       
        
    try
{
    Thread.sleep(20);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
escCode = 0x1B;
	
        row = (int)(e*i); column =i;

	System.out.print(String.format("%c[%d;%df",escCode,row,column));

	System.out.print(" "); 
}} 


ch--; }

}
*/


}

class Username implements java.io.Serializable
{
	public int score; public String name;


            
}

class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

}

