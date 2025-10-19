import java.util.Scanner;
public class Armstrong{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number1 = input.nextInt();

	int store = number1;
	int length = String.valueOf(number1).length();
	int sum = 0;

	while(number1 > 0){
		int count = 0;
		int result = 1;
		int remainder = number1 % 10;

		while(count < length){
			result *= remainder;
			count++;		
		}
		sum += result;
		number1 /= 10;
	}
		if(store == sum){
			System.out.print("It is an armstrong number");
		}
		else{
			System.out.print("It is not an armstrong number");

		}

	}
}