import java.util.Scanner;

public class GasMileage{
	
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter miles driven(Enter 0 to stop): ");
	int miles = input.nextInt();


	int totalMiles = 0 ;
	int totalGallons = 0;
	double totalMpg = 0;
	
	int counter = 0;
	
	while(miles != 0){
		
		totalMiles = totalMiles + miles;

		System.out.print("Enter gallons used: ");
		int gallons = input.nextInt();

		totalGallons += gallons;
		

		double milesPerGallon = (double)miles / gallons;
		totalMpg += milesPerGallon;
		
		System.out.printf("Miles per gallons used for this trip is : %.2f%n", milesPerGallon);
		counter++;
	
		System.out.println();

		System.out.print("Enter miles driven(Enter 0 to stop): ");
		miles = input.nextInt();
	}

	System.out.printf("The average miles per gallon for all the trips is %.2f", totalMpg / counter);
	















}











}