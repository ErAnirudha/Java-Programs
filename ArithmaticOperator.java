import java.util.Scanner;
public class ArithmaticOperator
{
 public static void main(String[]args){
  float add,sub,mul,div,modulus;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter value for X= ");
  float x=sc.nextFloat();
  System.out.print("Enter value for y= ");
  float y=sc.nextFloat();
add=x+y;
sub=x-y;
mul=x*y;
div=x/y;
modulus=x%y;
System.out.print("Substraction= ");
System.out.print(sub);
System.out.print("\nAddition= ");
System.out.print(add);
System.out.print("\nMultiplication= ");
System.out.println(mul);
System.out.print("Division= ");	
System.out.println(div);
System.out.print("Modulus= ");	
System.out.println(modulus);

//for printing in single line
/*
System.out.println("addition="+" "+add +"\nsubstraction="+" "+sub+"\nmultiplication="+" "+mul+"\ndivision="+" "+div+"\nmodulus="+" "+modulus);
*/
 }
}