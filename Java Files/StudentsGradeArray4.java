import java.util.Scanner;

	public class StudentsGradeArray4{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String [] names = new String[3];
	int [] grades = new int[3];

	int sum = 0;
	double average = 0;

	for(int i = 0; i < 3; i++){
	
	System.out.print("Enter Student name:");
	String name = input.nextLine();
	names[i] = name;

	System.out.print("Enter grade:");
	int grade = input.nextInt();
	grades[i] = grade;

	
	sum += grade;

	average = sum / 3;

	input.nextLine();
	}

	System.out.printf("%s  %8s", "Students name", "Score");
	
	for(int i = 0; i < 3; i++){
	System.out.printf("\n%8s  %10d%n", names[i],grades[i]);
	}

	System.out.println("The total score of student: " + sum);

	System.out.print("Average score: " + average);
}
}
