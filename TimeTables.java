import java.util.Scanner;

public class TimeTables{

	public static void main(String[]args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter any number between 1 and 10: ");
	int number  = scanner.nextInt();

	int count = 1;
	
	while(count <= 12){
		
		if(number < 1 || number > 10){
			System.out.print("Invalid input! try again.");
			count = 13;
		}
		else{
			System.out.printf("%d x %d = %d%n",number, count,number * count);
		}
		count++;

	}





}










}