let character = "e"

let characterCount = 0

let words = "semicolone"

for(let count = 0; count < words.length; count++){
	let letter = words.charAt(count);

	if (letter === "e") {
		characterCount += 1;
	}

}
	console.log(characterCount);