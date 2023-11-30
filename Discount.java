import java.util.Scanner;


public class Discount{

	public static void main(String[]args){


	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter item name: ");
	String itemName = scanner.next();

	System.out.printf("Enter the price for %s: ",itemName);
	double itemPrice = scanner.nextDouble();
	System.out.println();
	
	
	if(itemPrice < 0){
	
		System.out.print("Pay our debt!!!\n");
	
	}
	
	else{
	double discount = itemPrice * 0.1;
	double total = itemPrice - discount;

	System.out.printf("Item:  	%s%n",itemName);
	System.out.printf("Price: 	%.2f%n",itemPrice);
	System.out.println("Discount: 10%");
	System.out.printf("Grand Total: %.2f%n",total);

	}


}





}