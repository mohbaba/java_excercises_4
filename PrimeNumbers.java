import java.util.Scanner;

public class PrimeNumbers{

	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a positive number, 0 to cancel ");
	int number = input.nextInt();	

	
	

	while(number !=0 ){
		if(number < 13){
			
			if(number < 0){
			System.out.print("Enter a positive number, 0 to cancel ");
			number = input.nextInt();
			System.out.print("");


			}else
			if(number == 2){
				System.out.printf("%d is a prime number%n",number);
				System.out.print("Enter a positive number, 0 to cancel ");
				number = input.nextInt();
				System.out.print("");	
			}else

			if((number % 2 > 0) && (number % 9 > 0)){
				System.out.printf("%d is a prime number%n",number);
				System.out.print("Enter a positive number, 0 to cancel ");
				number = input.nextInt();
				System.out.print("");
			}
	
			else{
				System.out.printf("%d is not a prime number%n",number);
				System.out.print("Enter a positive number, 0 to cancel ");
				number = input.nextInt();
				System.out.print("");
			}		
		}else		
		if ((number % 2 > 0) && (number % 3 > 0)&&(number % 4 > 0)&&(number % 5 > 0)&&(number % 6 > 0)&&(number % 7 > 0)&&(number 		% 8 > 0)&&(number % 9 > 0)&&(number % 10 > 0)&&(number % 11 > 0)&&(number % 13  > 0) ){

			System.out.printf("%d is a prime number%n",number);
			System.out.print("Enter a positive number, 0 to cancel ");
			number = input.nextInt();
			System.out.print("");
		}
		else{
			System.out.printf("%d is not a prime number%n",number);
			System.out.print("Enter a positive number, 0 to cancel ");
			number = input.nextInt();

		}

	}

}


}