import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of firstnumber:");
	int a = s.nextInt();
	System.out.println("Enter the value of secondnumber:");
	int b = s.nextInt();
	System.out.println("Enter the operator: + - * % / ");
    char operator = s.next().charAt(0);
	switch(operator) { 
	 case '+':
		 System.out.println("Addition of two numbers: " + (a+b) );
		 break;
	 case '-':
		 System.out.println("Subtraction of two numbers: " + (a-b) );
		 break;
	 case '*':
		 System.out.println("Multiplication of two numbers: " + (a*b) );	
		 break;
	 case '/':
		 System.out.println("Division of two numbers: " + (a/b) );
		 break;
	 case '%':
		 System.out.println("Modulo of two numbers: " + (a%b) );
		 break;
	 default:
		 System.out.println("Enter the operators correctly" );
		 break;
	 }	
	}

}
