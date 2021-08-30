public class CompileTimePoly_Sub {
	static int a;
	static int b;
	static int c;
	static double g, e, f;

	public static void sub(int a, int b) 
	{
		c = a - b;
		System.out.println("Result is : "+c);
	}

	public static void sub(double e, double f) 
	{
		double g = e - f;
		System.out.println("Result is : "+g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    sub(25 , 5);
    sub(2.5 , 1.0);
	}

}
