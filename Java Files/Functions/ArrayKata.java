public class ArrayKata{
	public static int maximumIn(int [] array){

	int max = 0;

	for(int i = 0; i < array.length; i++){

	if (array[i] > max){
	max = array[i];
	}
	}
	return max;
}

public static int minimumIn(int [] array){

	int min = array[0];

	for(int i = 0; i < array.length; i++){

	if (array[i] < min){
	min = array[i];
	}
	}
	return min;
}

public static int sumOf(int [] array){
	int total = array[0];

	for (int i = 0; i < array.length; i++){
	total = total + array[i];
	
	}
	return total;
}

public static int sumOfEvenNumbers(int [] array){
	int sum = array[0];

	for (int i = 0; i < array.length; i++){
	if(array[i] % 2 == 0){
	sum = sum + array[i];
	}
	}
	return sum;
}

public static int sumOfOddNumbers(int [] array){
	int sum = array[0];

	for (int i = 0; i < array.length; i++){
	if(array[i] % 2 == 1){
	sum = sum + array[i];
	}
	}
	return sum;
}

public static int noOfOddNumbers(int [] array){
	int sum = array[0];
	int odd = 0;
	for (int i = 0; i < array.length; i++){
	if(array[i] % 2 == 1){
	odd++;
	}
	}
	return odd;
}

public static int noOfEvenNumbers(int [] array){
	int sum = array[0];
	int even = 0;
	for (int i = 0; i < array.length; i++){
	if(array[i] % 2 == 0){
	even++;
	}
	}
	return even;
}

public static int evenNumbersIn(int [] array){
	
	int i = 0;
	for (i = 0; i < array.length; i++){
	if(array[i] % 2 == 0){
	
	}
	}
	return array[i];
}


public static void main(String[] args){
	int [] myArray = {12, 44, 56, 76, 21, 10};
	ArrayKata m = new ArrayKata();
	System.out.println("Maximum number is "+m.maximumIn(myArray));
	System.out.println("Minimum number is "+m.minimumIn(myArray));
	System.out.println("Sum of numbers is "+m.sumOf(myArray));
	System.out.println("Sum of Even numbers is "+m.sumOfEvenNumbers(myArray));
	System.out.println("Sum of Odd numbers is "+m.sumOfOddNumbers(myArray));
	System.out.println("No of Odd numbers is "+m.noOfOddNumbers(myArray));
	System.out.println("No of Even numbers is "+m.noOfEvenNumbers(myArray));
	System.out.println("No of Arrays of Even numbers are "+m.evenNumbersIn(myArray));
}

}	