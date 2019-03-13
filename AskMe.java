import java.util.Random;
interface nariyal 
{ int NO = 0; int YES = 1; int MAYBE = 2; int LATER = 3; int SOON = 4; int NEVER = 5;
}
class Question implements nariyal 
{ Random rand = new Random(); 
int ask() {
int prob = (int) (100 * rand.nextDouble()); 
if (prob < 30)
	return NO;
    if (prob < 60) 
    	return YES;
	else if (prob < 75) 
		return LATER;
	else if (prob < 98) 
		return SOON;
	else return NEVER; } }
	
    class AskMe implements nariyal 
    { static void answer(int result) 
    { switch(result) 
    { case NO:
	System.out.println("No"); break;
	case YES:
	System.out.println("Yes"); break;
	case MAYBE:
	System.out.println("Maybe"); break;
	case LATER:
	System.out.println("Later"); break;
	case SOON:
	System.out.println("Soon"); break;
	case NEVER:
	System.out.println("Never"); break;
	} }
	public static void main(String args[]) 
	{ Question q = new Question();
	answer(q.ask()); answer(q.ask()); answer(q.ask()); answer(q.ask());
	}
}
