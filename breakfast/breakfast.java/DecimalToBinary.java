public class DecimalToBinary{
	public static void main(String [] args){

int number = 5;
String dividedNumber = "";

	while(number > 0){
		int remainder = number % 2;
		 dividedNumber += remainder ;
		 number /= 2;	
		
	}
	System.out.print(dividedNumber);
}
}