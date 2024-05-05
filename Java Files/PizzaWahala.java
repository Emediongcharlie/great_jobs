import java.util.Scanner;
public class PizzaWahala{
public static void main(String[]args){
String odogwu = null;
String sapaSize = null;
String smallMoney = null;
String bigBoys = null;
Scanner input = new Scanner(System.in);

System.out.print("How manu guest:");
int guest = input.nextInt();

System.out.print("What type of pizza:");
String type = input.next();
//int newType = Integer.parseInt(type);

input.nextLine();

//if(type == "odogwu"){
//int math = guest /12;
//int result = Math.round(math);
//System.out.print("Number of boxes of pizza to buy =  " +   result);
//}

//int mat = guest /8;
//int results = Math.round(mat);
//System.out.print("Number of box of pizza to buy =  " +   results);


switch(type){
case "Odogwu": double Od = Math.ceil((double)guest /12);
System.out.println("Number of boxes of pizza to buy =  " + Od  );
System.out.println("Number of slices left after serving = " +   (Od * 12 - guest));
System.out.print("Price = " + ((int)4200 * Od));
break;

case "bigBoys": double big = Math.ceil((double)guest /8);
System.out.println("Number of boxes of pizza to buy =  " + big  );
System.out.println("Number of slices left after serving = " +   (big * 8 - guest));
System.out.print("Price = " + ((int)3000 * big));

break;

case "smallMoney" : double small = Math.ceil((double)guest /6);
System.out.println("Number of boxes of pizza to buy =  " + small  );
System.out.println("Number of slices left after serving = " +   (small * 6 - guest));
System.out.print("Price = " + ((int)2400 * small));

break;


case "sapaSize": double sapa = Math.ceil((double)guest /4);
System.out.println("Number of boxes of pizza to buy =  " + sapa  );
System.out.println("Number of slices left after serving = " +   (sapa * 4 - guest));
System.out.print("Price = " + ((int)2000 * sapa));

break;
}
}
}