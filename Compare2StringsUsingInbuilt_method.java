package string;
//Strings Are Equal or Not By using Inbuilt method
public class Compare2StringsUsingInbuilt_method {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hillo";
		
		//Comparing Two Strings
	      boolean Ans=(s1.equals(s2));
	      if(Ans==true) {
	    	  System.out.println("Strings Are Equal");
	      }
	      else {
	    	  System.out.println("Strings Are not Equal");
	      }

	}

}
