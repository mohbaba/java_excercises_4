import java.util.Scanner;

public class SalesCommissionCalculator{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your id: ");
	int id = input.nextInt();

	double item1 = 239.99;
	double item2 = 129.75;
	double item3 = 99.95;
	double item4 = 350.89;

	double salesTotal = 0;
	double earnings = 0;

	int itemNumber = 1;

	while(itemNumber < 5 || id != 0){
		earnings = (salesTotal * 0.09) + 200;
		System.out.print("Enter the item number sold(Enter above 5 to terminate): ");
		itemNumber = input.nextInt();
		

		if (itemNumber == 1){
			salesTotal += item1;
		}else
		
		if(itemNumber == 2){
			salesTotal += item2; 
		}else

		if(itemNumber == 3){
			salesTotal += item3;
		}else
		
		if(itemNumber == 4){
			salesTotal += item4;
		}

		

		else{
			System.out.printf("Your earnings is $%.3f%n",earnings);
			salesTotal = 0;
			System.out.print("Enter your id: ");
			id = input.nextInt();


		}
		


		

	}
	
	

}


}