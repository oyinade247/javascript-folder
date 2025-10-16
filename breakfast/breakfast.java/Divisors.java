public class Divisors{
	public static void main(String [] args){
		
	int number = 10;
	int divisor = 2;
	
	while(number > 1){
		if(number % divisor == 0){
		number = number / divisor;
	
		}
		else{
			divisor++;
		}
		System.out.println(divisor);
	}

	}
}
	
