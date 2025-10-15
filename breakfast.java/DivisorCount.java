public class DivisorCount{
	public static void main(String [] args){
		
	int number = 10;
	int divisor = 2;
	int divisorCount = 0;
	
	while(number > 1){
		if(number % divisor == 0){
			number = number / divisor;
		}
		else{
			divisor++;
		}
		divisorCount++;
	}

	System.out.println(divisorCount);

}
}
