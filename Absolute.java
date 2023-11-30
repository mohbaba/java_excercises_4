import java.util.Scanner;

public class Absolute{

	public static void main(String[]args){


	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter any number: ");
	int number = scanner.nextInt();

	if(number < 0){
		System.out.printf("The absolute value of %d is %d%n",number, number * -1);
	}else 

	if(number > 0){
		System.out.printf("The absolute value of %d is %d%n",number,number);
	}else	

	if(number == 0){
		System.out.printf("The absolute value of %d is %d%n",number,number);
	}





}



}