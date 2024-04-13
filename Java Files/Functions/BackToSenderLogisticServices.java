
import java.util.Scanner;
public class BackToSenderLogisticServices{
public static int wages(int parcel){
	
	int amount = 0;
	int wages = 0;

	if (parcel >= 70){
	amount = parcel * 500; 
	wages = amount + 5000;
	return wages;
	}
	else if(parcel >= 60 && parcel <= 69){
	amount = parcel * 250;
	wages = amount + 5000;
	return wages;
	}
		
	else if(parcel >= 50 && parcel <= 59){
	amount = parcel * 200;
	wages = amount + 5000;
	return wages;
	}
		
	else if(parcel < 50){
	amount = parcel * 160;
	wages = amount + 5000;
	return wages;
	}
	return wages;
	}

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of successful deliveries:");
int parcel = input.nextInt();
System.out.print(wages(parcel));
	}
}
