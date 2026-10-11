package string;

import java.util.Scanner;

public class StringCompare {

	
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter Two string inputs For comparing");

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter input For String1: ");
		String s1= sc.next();

		System.out.println("Enter input For String2: ");
		String s2= sc.next();

		if(s1.length()==s2.length()) {

			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==s2.charAt(i)) {
					count++;
				}
			}
			if(count==s1.length()){
				System.out.println("Strings are Equal");
			}
			else {
				System.out.println("Strings are Not Equal");
			}
		}
		else {
			System.out.println("Strings are Not Equal!...");
		}
		sc.close();
	}

}
