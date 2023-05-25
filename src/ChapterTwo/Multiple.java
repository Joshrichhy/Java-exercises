package ChapterTwo;

import java.util.Scanner;

public class Multiple {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter Number: ");
	int firstNumber = scanner.nextInt();

	int firstNumberTrippled = firstNumber * 3;


	System.out.println("Enter Number: ");
	int secondNumber = scanner.nextInt();


	int secondNumberDoubled = secondNumber * 2;

	
	if ( firstNumberTrippled % secondNumberDoubled == 0) {

		System.out.printf("First Number Trippled is %d%n Second Number Doubled is %d%n %d is a Multiple of %d", firstNumberTrippled, secondNumberDoubled, firstNumberTrippled, secondNumberDoubled);
}


	else  {
		System.out.printf("First Number Trippled is %d%n Second Number Doubled is %d%n %d is not a Multiple of %d", firstNumberTrippled, secondNumberDoubled, firstNumberTrippled, secondNumberDoubled);

}







}


}