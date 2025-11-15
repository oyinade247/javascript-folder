public class PerfectNumberCount{
	public static void main(String [] args){
			

	for(int count = 1; count <= 1000; count++){
			int number = count;
			int sum = 0;
		for(int counter = 1; counter < number; counter++){
				
			if(number % counter == 0){
				sum += counter;	
			}	
		}
		if(count == sum){
			System.out.println(count);
		}
		
	}
		

	}

}