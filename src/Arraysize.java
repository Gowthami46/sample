import java.util.Scanner;

public class Arraysize  {

	public static void main(String[] args) {
		
		int[] array_name = new int[5];
		Scanner obj = new Scanner(System.in);
		int size=array_name.length;
		System.out.println("Size of the array length:" + size);
		//System.out.println(size);
		System.out.println("Array values are:");
		for(int i=0;i<5;i++) {
			array_name[i] = obj.nextInt();
		}
		System.out.println("Array values are:");
		for(int i=0;i<5;i++) {
			System.out.println(array_name[i] );
			
		}
		//System.out.println("Length of an array:",array_name.length);
}

	
}