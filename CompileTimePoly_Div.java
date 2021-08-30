
public class CompileTimePoly_Div {
	static int a;
	static int b;
	static int c;
	static double g, e, f;

	public static void div(int a, int b) 
	{
		c = a / b;
		System.out.println("Result is : "+c);
	}

	public static void div(double e, double f) 
	{
		double g = e / f;
		System.out.println("Result is : "+g);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div(25 , 5);
		div(2.5 , 1.0);
	}

}
