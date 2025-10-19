import java.util.Scanner;
public class PerfectNumber{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number1 = input.nextInt();

	int sum = 0;
	for (int count = 1; count < number1; count++) {	
		if (number1 % count == 0) {
			sum += count;
		}
		
	}
		if(number1 == sum){
			System.out.print("It is a perfect number");
		}
		else{
			System.out.print("It is not a perfect number");

		}
			
	
	}
}
