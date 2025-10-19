import java.util.Scanner;
public class StrongNumber{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int store = input.nextInt();

		int number1 = store;
		int sum = 0;

		while(number1 > 0){
			int factorial = 1;
			int count = 1;

			int remainder = number1 % 10;

			while(count < remainder){
				factorial += (remainder - count) * factorial;
				count++;
				
			}
			sum += factorial;
			number1 /= 10;
			
		}
		if(store == sum){
			System.out.print("It is a stong number");
		}
			
		else{
			System.out.print("It is not a stong number");
		}
		

	}
}
