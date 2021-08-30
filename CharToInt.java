
public class CharToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		String r ="Radha Ghorpade";
		char c = r.charAt(24);
		System.out.println(c);
	
   }
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("String IndexOutOfBoundException");
	}
  }

}
