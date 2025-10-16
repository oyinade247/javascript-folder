public class PrimNumbers{
	public static void main(String [] args){

	int divisor = 2;
	int number = 100;

	for(int count = 2; count < number; count++){
		if(number % count == 0){
			System.out.print(number);
		}
	}
}
}