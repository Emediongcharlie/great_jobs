import java.util.Scanner;

	public  class NumberCount {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int i;
	int numN = 0;
	int numP = 0;
	int numZ = 0;
	

	System.out.print("Enter number of count:");
	int numberOfCount = input.nextInt();
	
	for (i = 1; i <= numberOfCount; i++)
	{

	System.out.print("Enter number:");
	int num = input.nextInt();

		if(num > 0)
		numP++;
	
		if(num < 0)
		numN++;
	
		if(num == 0)
		numZ++;
	
	
	}
	System.out.println("The total of positive numbers is  " + numP++);
	System.out.println("The total of negative numbers is  " + numN++);
	System.out.println("The total of Zero's is  " + numZ++);

}

}