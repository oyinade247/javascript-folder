public class SmallestNumber{
	public static void main(String [] args){
	
int number = 12345;
int smallest = number % 10;
int remainder = 0;

	while(number > 0){
		remainder = number % 10;
		if(remainder < smallest){
			smallest = remainder;
		}
		number /= 10;
	}
	System.out.print(smallest);


	}
}