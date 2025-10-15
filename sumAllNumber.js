let number = "12345";

let conNumber = parseInt(number)

let sum = 0;

while(conNumber > 0){
	let dividedNumber = conNumber % 10;
	sum =  sum + dividedNumber;
	conNumber /= 10;
	
	console.log(sum);
}

