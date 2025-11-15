//function bugTrackingApp(reportBug){

		//let newArray = reportBug.push(0,1,2,3,4,5,6);

		//let newList = reportBug.slice(0, 5);

		//return newList;

//}

//let reportBug = [1, 2, 3, 4, 5];
//console.log(bugTrackingApp(reportBug));







function analyst(results){
	let newArray = []
	for(let score of results){
		for(let key in score){newArray.push(score);
		newArray.sort((a,b)=> b.score -a.score);
	}
					
	}
	return newArray;

}


function truck(logistic){
	let newArray = []
	for(let bug of logistic){
		for(let data in bug){
			if(data == "null"){
				logistic.remove(bug);
				newArray.push(logistic);
			}
		}
	}

	return newArray;



}




let logistic = [{longitude : "null",latitude : 20},{longitude : 10, latitude : "null"},{longitude: "null", latitude: 30}]
console.log(truck(logistic));
let results = [{name : "Oyin", score : 70}, {name: "ade", score : 20}, { name:"bisi", score : 94}, {name : "kayo", score : 90}]

console.log(analyst(results));			
			
    	














