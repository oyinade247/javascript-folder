import java.util.Scanner;

public class Typing{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String text = "My name is Oyinade";
		System.out.println(text);
		long startTime = System.currentTimeMillis();
		System.out.print("Enter the same text: ");
		String word = input.nextLine();
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		long totalSeconds = timeTaken / 1000;
		long currentSeconds = totalSeconds % 60; 
		System.out.println("The total time taken is" + currentSeconds + " seconds");

		int numberOfWords = text.split(" ").length;
		double currentMinutes = (timeTaken / 1000.0) / 60.0;
		double wordPerMinutes = numberOfWords / currentMinutes;

		System.out.printf("The word per minutes %.2f",wordPerMinutes);	

		
	}
	

}