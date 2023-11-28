import java.util.Scanner;

public class CreditLimitCalculator{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.println("Welcome to MohBaba Store!!");

	System.out.print("Enter account number or 0 to cancel: ");
	int accountNum = input.nextInt();
	
	int counter = 0;
	
	while(accountNum != 0){

		System.out.print("Enter your balance at the beginning of this month: ");
		int balance = input.nextInt();

		System.out.print("Enter total of all items charged within this month: ");
		int totalItemcharge = input.nextInt();

		System.out.print("Enter the total of all credit applied to account within this month: ");		
		int totalCreditCharge = input.nextInt();

		System.out.print("Enter allowed credit limit: ");
		int creditLimit = input.nextInt();

		double newBalance = (double) (balance + totalCreditCharge ) - creditLimit;
		System.out.printf("The balance for user %d is %.2f%n",accountNum , newBalance);
		
			if(newBalance > creditLimit){System.out.println("Credit limit exceeded");}
		

		System.out.print("Enter account number or 0 to cancel: ");
		accountNum = input.nextInt();
	
	
	}


	System.out.println("Thank you for patronage!");











}



















}