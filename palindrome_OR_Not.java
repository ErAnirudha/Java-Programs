package string;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		System.out.print("Enter input from user To identify Palindrome or not: =");
		Scanner sc =new Scanner(System.in);
		String input=sc.nextLine();
		String Empt="";
		for(int i=input.length()-1; i>=0; i--) {
			Empt=Empt+input.charAt(i);	

		}
		System.out.println("Reverse String:= "+Empt);
		if(input.contains(Empt)) 
		{
			System.out.println("Entered string is Palindrome ");
		}
			else {
				System.out.println("Not palindrome");
				sc.close();
			}
		}
	

	}



