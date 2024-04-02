import java.util.Scanner;
	public class DoWhileSum {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int num = 0;

	do {

	sum += num;
	System.out.print("Enter number:");
	num = input.nextInt();
	}
	while(num >= 0);

	System.out.print("The Sum of the entered positive number is  " + sum);
}
}