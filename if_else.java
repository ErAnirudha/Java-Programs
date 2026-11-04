//Check whether a number is positive or negative or zero
//Description: Write a Java program to check whether a given number is positive, negative, or zero.

package Conditional_statements;

import java.util.Scanner;

public class Exp_02_if_else {

	public static void main(String[] args) {
		System.out.println("Enter Any Number from keyboard to identify its +ive, -ive or Zero");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0) {
			System.out.println("You Entered Number is Zero= " +a);
		}
		
		if(a>0) {
			System.out.println("You Entered Number is Positive = "+a);
		}
        
		if(a<0) {
			System.out.println("Yoy Entered Number is Negative = " +a);
		}
		sc.close();
	}

}
