
public class CountVowels{
	public static void main(String [] args){

String vowels = "aeiou";

String words = "mr femi";

int vowelCount = 0;

	for(int count = 0; count < words.length(); count++){
		char word = words.charAt(count);

		for (int index = 0; index < vowels.length(); index++){
			if(word == vowels.charAt(index)){
				vowelCount += 1;
				break;
			}
		}
	}
		System.out.print(vowelCount);
}
}