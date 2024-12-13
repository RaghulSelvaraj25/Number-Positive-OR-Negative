package PROJECT.CHECKNUMBERS;

import java.util.Scanner;

public class checkpositiveornegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		double number = scanner.nextDouble();
		if(number>0){
			System.out.println("Given number is " +number +" which is Positive" );
		}else if (number<0) {
			System.out.println("Given number is " +number +" which is Negative" );
		}else {
			System.out.println("Given number is " +number +" which is Zero" );
		}
		
		scanner.close();
	}

}
