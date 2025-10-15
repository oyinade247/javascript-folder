public class Binary{
	public static void main(String [] args){

String number = "100";


String reversed = "";
	int convertedNumber = Integer.parseInt(number);

	while( convertedNumber> 0){
	
	int dividedNumber = convertedNumber % 2;
	reversed += dividedNumber;
	convertedNumber /= 2;

	}
	System.out.print(reversed);

	

	


}
}