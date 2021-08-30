public class CompileTimePoly_Add {
	static int a;
	static int b;
	static int c;
	static double g, e, f;

	public static void add(int a, int b) 
	{
		c = a + b;
		System.out.println("Result is : "+c);
	}

	public static void add(double e, double f) 
	{
		double g = e + f;
		System.out.println("Result is : "+g);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 add(25 , 5);
		 add(2.5 , 1.0);
		 
	}

}
