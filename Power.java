import java.util.Scanner;
import java.lang.Math;

	public  class Power {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter number:");
	int number = input.nextInt();

	System.out.print("Enter number2:");
	int number2 = input.nextInt();

	double raiseToPower = Math.pow(number, number2);

	System.out.println("the answer is  " + raiseToPower);
}
}
