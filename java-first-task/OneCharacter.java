
public class CharacterString{
	public static void main(String [] args){


char character = 'e';

int characterCount = 0;

String words = "semicolone";

for(int count = 0; count < words.length(); count++){
	char letter = words.charAt(count);
	
	if (letter == character) {
		characterCount += 1;
	}

}
	System.out.print(characterCount);

}
}