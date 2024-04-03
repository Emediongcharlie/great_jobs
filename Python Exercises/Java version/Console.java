import java.util.Scanner;
import java.lang.Math;
	public class Console{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter D:");
	int d = input.nextInt();

	int C = 50;
	int H = 30;

	int R = 2 * C * d;
	int M = R / H;
	double Q = Math.sqrt(M);

System.out.printf("%.0f", + Q);

}
}