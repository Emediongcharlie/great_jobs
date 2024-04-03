import java.util.Scanner;

	public class DiscountedPrice{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter price:");
	int price = input.nextInt();

	double discount = 0.1 * price;

	double discountedPrice = price - discount;

	System.out.print("the discounted price is " + discountedPrice);

}
}