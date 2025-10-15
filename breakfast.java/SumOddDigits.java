public class SumOddDigits{
	public static void main(String [] args){

	int number = 12345;

	int sum = 1;

	while(number > 0 ){
	int dividedNumber = number % 10;
	if(dividedNumber % 2 == 1){
		sum = sum + dividedNumber;
	}
		number /= 10;

		
	}
	System.out.print(sum);
	
}
}