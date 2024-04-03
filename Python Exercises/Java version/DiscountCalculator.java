import java.util.Scanner;
	public class DiscountCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter price from user:");
	int price = input.nextInt();

	System.out.print("Enter discount in percentage from user:");
	int discount = input.nextInt();

	float realDiscount = discount / 100;

	

	System.out.printf("The price after discount is %d%2f" + realDiscount);

}

}
	