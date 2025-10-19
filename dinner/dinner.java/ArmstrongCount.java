public class ArmstrongCount{
	public static void main(String [] args){

	
		for(int count = 1; count < 1000; count++){
				int length = String.valueOf(count).length();
				int sum = 0;
				int number1 = count;


			while(number1 > 0){

				int counter = 0;
				int result = 1;
				int remainder = number1 % 10;

				while(counter < length){
					result *= remainder;
					counter++;		
				}
				sum += result;
				number1 /= 10;
			}

			if (count == sum) {
				System.out.println(count);
			}

		}

	}
}