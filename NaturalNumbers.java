import java.util.Scanner;
	public class NaturalNumbers{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 1;
	int sum = 0;
	int number = 10;

	while(counter <= number) {

	
	sum += counter;

	counter++;
	}
	
	
	System.out.print("Sum of natural numbers is  " + sum);
}
}