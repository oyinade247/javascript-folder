public class Binary{
	public static void main(String [] args){

String number = "100";
int power = 1;
int sum = 0;

	int convertedNumber = Integer.parseInt(number);

	while(convertedNumber > 0){
		int remainder = convertedNumber % 10;
		 sum += remainder * power;
		power = power * 2;  
		convertedNumber /= 10;	
		
	}
	System.out.print(sum);

	

	


}
}