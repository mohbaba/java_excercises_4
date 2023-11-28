import java.util.Scanner;

public class Factor{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	
	int factor = 0;
	int count = 1;
	while(number >= count){

		factor = number % count;
		
		if(factor == 0){
			System.out.printf("%d%n",count);


		}
		count++;








	}
	











}











}