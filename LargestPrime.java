

//Solution to problem 3 from project Euler: "The prime factors of 13195 are 5, 7, 13 
//and 29. What is the largest prime factor of the number 600851475143 ?"

public class LargestPrimeFactor {

	public static void main(String[] args) {
		LargestPrimeFactor(1000);
	}

private static void LargestPrimeFactor(double number){
    double largestFactor = 0;
	for(double i = 0; i < number; i++){
		if(number % i == 0 && isPrime(i)){
			largestFactor = i;
		}
	}
    System.out.println(largestFactor);
}

boolean isPrime (double factor) {
	if(factor % 2 == 0) return false;
	for(var i = 3; i*i <= factor; i+= 2){
		if(factor % i == 0) return false;
	}
	return true;
}


}




