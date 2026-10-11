package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.print("Enter String For Reverse: ");
	    Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		
		// ANIRUDHA
		//String name="Anirudha";
		String Rev=" ";
	   System.out.println("Entred String length= "+ name.length());
	  
	  for (int i=name.length()-1; i>=0;i--) {
		  Rev=Rev+name.charAt(i);
		 
	  }
	  System.out.println("Reverse string  = " + Rev);
	  sc.close();
	}

}
