public class Divisors{
	public static void main(String [] args){
		
	int number = 10;
	int divisor = 2;
	

	while(divisor <= number){
		if(number % divisor == 0){
			System.out.println(divisor);
		}
		else{
			divisor++;
		}
	}

	}
}
	
