public class SumAllDigits{
	public static void main(String [] args){
	

int number = 12345;
int dividedNumber = 0;

	while(number > 0){
		int remainder = number % 10;
		dividedNumber += remainder;
		number /= 10;	
	}
	System.out.print(dividedNumber);
	
}

}