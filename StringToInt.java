
public class StringToInt {
	 String str;
     int a=0;
     
     void StringToInt(String Str) {
   	  {
   		  try {
   			  a=Integer.parseInt(Str);
   			  System.out.println("String" +str+"to Int "+a);
   		  }
   		  catch(NumberFormatException e)
   		  {
   			  System.out.println("e");
   		  }
   	   }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		StringToInt s=new StringToInt();
		String s1="xyz";
		s.StringToInt(s1);
      }
	

}
