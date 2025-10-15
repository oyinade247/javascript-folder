public class PrimNumbers{
	public static void main(String [] args){

	int divisor = 2;

	for(int count = 2; count < 100; count++){
		if(count % divisor == 0){
			System.out.println(count);
		}
	}
}
}