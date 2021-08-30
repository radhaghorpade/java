import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Radius: ");
	    float radius=sc.nextFloat();
	    double area = 3.14 * radius * radius;
	    System.out.println("Area Of Circle:"+area);
	    double perimeter = 2 * 3.14 * radius;
	    System.out.println("Perimeter Of Circle:"+perimeter);
	    
	}

}
