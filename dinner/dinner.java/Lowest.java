import java.util.Scanner;
public class LowestFactor{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number1 = input.nextInt();

	System.out.print("Enter a number: ");
	int number2 = input.nextInt();

	 
	 int gcd = 1;
	 int divisor = 2;
	while(divisor <= number1 && divisor <= number2){
		if(number1 % divisor == 0 && number2 % divisor == 0){
			gcd = divisor;
		}
		divisor++;
	}
		int lowest = (number1 * number2) / gcd;
		System.out.print(lowest);
	
	}

}