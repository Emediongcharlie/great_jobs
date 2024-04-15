import java.util.Scanner;

	public class StudentsGradeArray{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String [] names = new String[5];
	int [] grades = new int[5];

	for(int i = 0; i < 5; i++){
	
	System.out.print("Enter Student name:");
	String name = input.nextLine();
	names[i] = name;

	System.out.print("Enter grade:");
	int grade = input.nextInt();
	grades[i] = grade;

	input.nextLine();
	}

	for(int i = 0; i < 5; i++){
	System.out.println(names[i]);
	System.out.println(grades[i]);
	}
}
}
	
