import java.util.Scanner;

	public class DataType{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter name:");
	String name = input.nextLine();

	

	System.out.println(name + " data type is  " + ((Object)name).getClass().getSimpleName());
}

	
}