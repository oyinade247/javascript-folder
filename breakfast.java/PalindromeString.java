public class PalindromeString{
	public static void main(String [] args){
	
String name = "oo";
String store = " ";
char letters = '\u0000';

		for(int count = name.length() - 1 ; count >= 0; count--){
			letters = name.charAt(count);
		}

		String convertedChar = String.valueOf(letters);

		if(name.equals (convertedChar)){
			System.out.print("It is a palindrome");
		}
		else{
			System.out.print("It is not a palindrome");
		}
	}
}


