let number = 10;
let divisor = 2;
let divisorCount = 0;
	
	while(divisor <= number){
		if(number % divisor == 0){
			divisorCount++;
		}
		else{
			divisor++;
		}
	}

	console.log(divisorCount);
