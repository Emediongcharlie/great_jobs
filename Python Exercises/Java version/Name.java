import java.util.Scanner;

	public class Name{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter country:");
	String country = input.nextLine();

	System.out.print("Enter continent:");
	String continent = input.nextLine();

	System.out.println(country + " And " + continent);
}

	
}