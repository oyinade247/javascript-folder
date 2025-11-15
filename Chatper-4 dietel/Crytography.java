import java.util.Arrays;
import java.util.Scanner;
public class Crytography{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter four digits number:");
	int number = input.nextInt();

	String dividedNumber = "";
	int [] encryptedNumber = new int[4];


	int counter = 0;
		
	while(number > 0){
		int remainder = number % 10;
		int add = remainder + 7;
		int secondRemainder = add % 10;
		number /=10;
		
		encryptedNumber[3 - counter] = secondRemainder;
		counter++;

	}
	int temp = encryptedNumber[0];

	encryptedNumber[0] = encryptedNumber[2];;
	 encryptedNumber[2] = temp;

	int temp2 = encryptedNumber [1];
 	encryptedNumber[1] = encryptedNumber [3];
	encryptedNumber[3] = temp2;

	System.out.print(Arrays.toString(encryptedNumber));


	
	
	
	}


}