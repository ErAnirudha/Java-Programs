import java.util.Scanner;                              //header file
public class ArithmaticOperator                       // class name    
{
 public static void main(String[]args){              //main function start
  float add,sub,mul,div,modulus;
  Scanner sc=new Scanner(System.in);                 //Scanning Syntax     **Scanner sc=new Scanner(System.in);**
  System.out.print("Enter value for X= ");           // for printing print function
  float x=sc.nextFloat();                            // if we use println it will print at next line 
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
