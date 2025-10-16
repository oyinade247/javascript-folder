public class ReverseString{
	public static void main(String [] args){

String name = "Oyinade";

	for(int count = name.length() - 1; count >= 0 ; count--){
		char letters = name.charAt(count);
		System.out.println(letters);

	}

}
}