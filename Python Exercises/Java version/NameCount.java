import java.util.Scanner;

	public class NameCount{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter name:");
	String name = input.nextLine();

	int stringsize = name.length();

	System.out.println(stringsize);
}

	
}