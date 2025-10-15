public class AverageNumbers{
	public static void main(String [] args){
	
	int average = 0;
	int sum = 0;
	int counter = 0;
	for(int count = 1; count <= 100 ; count++){
		sum += count;
		counter++;
	}
	average = sum / counter;
	System.out.print(average);
}
}