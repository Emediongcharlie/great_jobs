import java.util.Scanner;

	public  class SmallestAndLargestNumber {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int i;
	int largest = 0;
	int smallest = 1;
	
	

	System.out.print("Enter number of count:");
	int numberOfCount = input.nextInt();
	
	for (i = 1; i <= numberOfCount; i++)
	{

	System.out.print("Enter number:");
	int num = input.nextInt();

		if(num > largest)
		largest = num;
	
		if(num <= smallest)
		smallest = num;
	
	
	
	}
	System.out.println("The smallest numbers is  " + smallest);
	System.out.println("The largest numbers is  " + largest);
}
}