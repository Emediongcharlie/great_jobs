import java.util.Scanner;

	public  class Factorial {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	
	int factorial = 1;
	int counter = 1;
	
	System.out.print("Enter number:");
	int number = input.nextInt();

	while(counter <= number) {

	
	
	factorial *= counter;
	
	counter++;
	}

	System.out.print("factorial is  " + factorial);
}
}
	