public class LargestNumber{
	public static void main(String [] args){
	
int number = 12345;
int largest = 0;
int remainder = 0;

	while(number > 0){
		remainder = number % 10;
		if(remainder > largest){
			largest = remainder;
		}
		number /= 10;
	}
	System.out.print(largest);


	}
}