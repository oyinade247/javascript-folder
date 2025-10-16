let number = "12345";

let store = "";

let count = 0;

while(number > 0){
	let dividedNumber = number % 10;
	count += 1;
	store += dividedNumber;
	number /= 10;
	

}

console.log(count);