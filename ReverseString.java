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
	  
	  for (int i=name.length(); i>=0;i--) {
		  Rev=Rev+name.charAt(i);
		 
	  }
	  System.out.println("Reverse string  = " + Rev);
	  sc.close();
	}

}

/*
Because Java strings are 0-indexed: the valid indexes run from 0 to length() - 1.

Take name = "abc":

index	0	1	2
char	a	b	c

name.length() is 3, but there is no character at index 3. The last valid index is 2.

In your loop, the first iteration starts with i = name.length(), so it calls:

java
name.charAt(3);  // index 3 doesn't exist

Java throws StringIndexOutOfBoundsException right there (a subclass of IndexOutOfBoundsException, which is why you see it described as an index-out-of-bounds error).

*/
