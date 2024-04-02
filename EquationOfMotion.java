import java.util.Scanner;

public class EquationOfMotion {
	public static void main(String []args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter velocity in meters per seconds:");
	double velocityInMetersPerSeconds = scanner.nextDouble();

	System.out.println("Enter time in seconds:");
	double timeInSeconds = scanner.nextDouble();

	System.out.println("Enter acceleration in meters per seconds squared:");
	double accelerationInMetersPerSecondsSquared = scanner.nextDouble();

	double velocityAndTime = velocityInMetersPerSeconds*timeInSeconds;

	double timeSquared = timeInSeconds*timeInSeconds;

	double timeAndAcceleration = accelerationInMetersPerSecondsSquared*timeSquared;

	double division = timeAndAcceleration/2;

	double distance = velocityAndTime + division;

	System.out.printf("Distance is   %f", distance);

	}

}
