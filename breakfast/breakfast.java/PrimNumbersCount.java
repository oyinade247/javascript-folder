public class PrimNumbersCount{
	public static void main(String [] args){

	int divisor = 2;

	int primeCount = 0;
	for(int count = 2; count < 100; count++){
		if(count % divisor == 0){
			primeCount++;
		}
	System.out.print(primeCount);
			
	}
}
}