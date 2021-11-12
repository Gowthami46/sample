import java.util.Scanner;


public class Swapprog {

	public static void main(String[] args) {
		
		System.out.println("Swapping of 2 numbers:");
		@SuppressWarnings("resource")
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = obj.nextInt();
		System.out.println("Enter the value of b:");
		int b = obj.nextInt();
		System.out.println("Numbers before swapping: " +a +"   "+ +b);
		if(a ==  b) {
			System.out.println("Both the numbers are equal");
		}
		else
		{
			int c = a;
			a = b;
			b = c;
			System.out.println("Numbers after swapping: " +a +"   "+ +b);
		}
	}

}
