
const prompt = require('prompt-sync')();


const text = "My name is Oyinade";
	console.log(text);

const start = new Date();
	let input = prompt("Enter the text above :  ");	
const end = new Date();
		let totalTime  = end - start ;
		let  totalSeconds = totalTime / 1000;
		
		console.log("The total time taken is" + totalSeconds + " seconds");

		let numberOfWords = text.split(" ").length;
		let currentMinutes =  totalSeconds/ 60.0;
		let wordPerMinutes = numberOfWords / currentMinutes;

		console.log("The word per minutes " + wordPerMinutes);	

	