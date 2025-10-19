let number = 100;
let power = 1;
let sum = 0;

	while(number > 0){
		let remainder = number % 10;
		 sum += remainder * power;
		power = power * 2;  
		Math.trunc(number /= 10);	
		
	}
	System.out.print(sum);

