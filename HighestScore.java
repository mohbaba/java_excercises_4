import java.util.Scanner;

public class HighestScore{

	public static void main(String[]args){

	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int studentNum = input.nextInt();
		
		

		
		
		
		int count = 0;
		int largest = 0;
		String highestName = "";


		while(count < studentNum){

			

			System.out.print("Enter students name: ");
			String name = input.next();

			System.out.print("Enter student score: ");
			int score = input.nextInt();
			
			System.out.print("\n");
						


			if(score > largest){
				largest = score; 
				highestName = name; 
			}
			count++;
	
		}

		System.out.printf("The student with the highest score is %s with a %d score%n",highestName,largest);
		



}


















}