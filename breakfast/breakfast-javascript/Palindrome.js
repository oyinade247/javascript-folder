let number = 121;
let store = number;

let reversed = "";

	while(number > 0){
	
	let dividedNumber = number % 10;
	reversed += dividedNumber;
	number = Math.trunc(number / 10);

	}

	let convertedNumber = Number(reversed);

	if(store == convertedNumber){
		System.out.print("It is a palindrome");
	}
	else{
	System.out.print("it is not a palindrome");
	}

