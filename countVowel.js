let vowels = "aeiou"

let words = "mr femi"

let vowelCount = 0

	for(let count = 0; count < words.length; count++){
		let word = words.charAt(count);

		for (let index = 0; index < vowels.length; index++){
			if(word === vowels.charAt(index)){
				vowelCount += 1;
				break;
			}
		}
	}
		console.log(vowelCount);

