let number = "12345";

let sum = 0;

while(number > 0){
	let dividedNumber = number % 10;
	sum =  sum + dividedNumber;
	number /= 10;
	
	console.log(sum);
}

