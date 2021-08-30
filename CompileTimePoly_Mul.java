
public class CompileTimePoly_Mul {
	static int a;
	static int b;
	static int c;
	static double g, e, f;

	public static void mul(int a, int b) 
	{
		c = a * b;
		System.out.println("Result is : "+c);
	}

	public static void mul(double e, double f) 
	{
		double g = e * f;
		System.out.println("Result is : "+g);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul(25 , 5);
		mul(2.5 , 1.0);
	}

}
