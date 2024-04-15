import java.util.Scanner;


	public class NamesColllector2{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int [] numbers = new int [5];

	for(int i = 0; i < 5; i++){
	
	System.out.print("Enter number:");
	int number = input.nextInt();
	numbers[i] = number;
	}
	
	for(int i = 0; i < 5; i++){
	System.out.println(numbers[i]);
	}
	
}
}