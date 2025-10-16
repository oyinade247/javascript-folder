public class SumEvenDigits{
	public static void main(String [] args){

	int number = 12345;

	int sum = 0;

	while(number > 0 ){
	int dividedNumber = number % 10;
	if(dividedNumber % 2 == 0){
		sum += dividedNumber;
	}
		number /= 10;
		
	}
	System.out.print(sum);
	
}
}