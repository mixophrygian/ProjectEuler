//Solution to problem 3 from project Euler: "The prime factors of 13195 are 5, 7, 13 
//and 29. What is the largest prime factor of the number 600851475143 ?"

var LargestPrimeFactor = function (number) {
    var largestFactor = 0;
	for(var i = 3; i < number; i++){
		if(number % i === 0 && isPrime(i)){
			largestFactor = i;
		}
	}
    console.log(largestFactor);
};

var isPrime = function (factor) {
	if(factor % 2 === 0) return false;
	for(var i = 3; i*i <= factor; i+= 2){
		if(factor % i === 0) return false;
	}
	return true;
};

LargestPrimeFactor(1001);

