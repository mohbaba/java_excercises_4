import java.util.Scanner;

public class TaxCalculator{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	

	 
	double earnings = 0;
	double tax = 0;
	int count = 0;
	while(count <3 ){

		System.out.print("Enter citizens name: ");
		String name = input.next();
		
		System.out.print("Enter citizens earnings: ");
		earnings = input.nextDouble();

		if (earnings < 30000){
			tax = (earnings * 0.15) ;
			System.out.printf("Your tax is %.2f%n",tax);
		}else

		if(earnings > 30000){
			tax = (earnings * 0.20) ;
			System.out.printf("Your tax is %.2f%n",tax);
		}
		count++;
		
		 
		



















	}

	

	 













}


















}