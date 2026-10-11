package string;

public class OperationsOnString {

	public static void main(String[] args)
	{
		String Txt1="ABCDEFGHIJ";
		String Txt2="abcde";
		
		//To count string length by using length() method
		System.out.println("Length of String :"+Txt1.length()); //Length of String :10
		
		
		//The toUpperCase() method converts a string to upper case letters.
		System.out.println(Txt2.toUpperCase());   //ABCDE
		
		//The toLowerCase() method converts a string to lower case letters.
		System.out.println(Txt1.toLowerCase());   //abcdefghij
		
		/*
		 * Finding a Character in a String The indexOf() method returns the index (the
		 * position) of the first occurrence of a specified text in a string (including
		 * whitespace):
		 * Java counts positions from zero.
           0 is the first position in a string, 1 is the second, 2 is the third ..
		 */
		String txt="Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate"));  //Output 7 
		
       //You can use the charAt() method to access a character at a specific position in a string:
		System.out.println("Character At place in given string: "+ txt.charAt(2));
		
		//To compare two strings, you can use the equals() method:
		System.out.println("compare Two strings:" + Txt1.equals(Txt2)); //it Return Boolean
		
		String Abc="sagar";
		String Pqr="sagar";
		
		/*
		 * compareTo() compares two Strings lexicographically, meaning it compares their
		 * characters based on their Unicode values from left to right.
		 */
		System.out.println("String Equals :" + Abc.compareTo(Pqr));
		 
		//To compare two strings, you can use the equals() method:  it return boolean value
		System.out.println("String Equals:" + Abc.equals(Pqr));
		
		//The trim() method removes whitespace from the beginning and the end of a string:
		String Ant= "    Hello India    ";
		System.out.println("Before Trim:  ["+ Ant +"]" );
		System.out.println("After Trim: ["+ Ant.trim() +"]");
		
		
		//Return the Unicode of the first character in a string (the Unicode value of "H" is 72):
		System.out.println("To check unicode At the index letter :"+ Ant.codePointAt(3));
		// its a unicode/Ascii value For space
		
		String str="anirudha";
		
		System.out.println("unide value For a :"+ str.codePointAt(0)); // it Returns value 97 Ascii value of a
		
		System.out.println("unicode value codepointBefore() : "+ str.codePointBefore(1));
		//Before n letter in string is a so it gives same output
		
		//Java String codePointCount() Method Return the number of Unicode values found in a string:
		System.out.println(str.codePointCount(0, 5 ));
		
		//Find out if a string contains a sequence of characters:Java String contains() Method
		System.out.println("Provided string contains or Not = " + str.contains("rud"));
		System.out.println(str.contains("hello"));
		//it return Boolean Format if present then True otherwise return False
		
	}

}
