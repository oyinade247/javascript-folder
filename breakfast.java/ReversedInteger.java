public class ReversedInteger{
	public static void main(String [] args){
	
int number = 12345;
String reversed = "";

	while(number > 0){
	
	int dividedNumber = number % 10;
	reversed += dividedNumber;
	number /= 10;

	}
	System.out.print(reversed);

}
}