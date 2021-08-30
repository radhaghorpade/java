import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i, res=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int number=sc.nextInt();
    for(i=1;i<=10;i++) {
    	res = number * i;
    	System.out.println(number+"*"+i+"="+res);
    	
    }
    
	}

}
