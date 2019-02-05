public class Example12{
	int fact() {
		int a=10;
		int f=1;
		while(a>0) {
			f=f*a;
			a--;
		}
		return f;
	}
	public static void main(String[] args) {
		Example12 ob = new Example12();
		System.out.println("factorial of 10 is"+ob.fact());
	}
}