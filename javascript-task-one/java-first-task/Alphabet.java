
public class Alphabet{
	public static void main(String [] args){

String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String alpha_string = "";
for(int count = 0; count < alphabets.length(); count++){
	alpha_string += alphabets.charAt(count) + " ";
}
System.out.print(alpha_string);
}
}