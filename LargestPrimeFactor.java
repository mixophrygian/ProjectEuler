

//Solution to problem 3 from project Euler: "The prime factors of 13195 are 5, 7, 13 
//and 29. What is the largest prime factor of the number 600851475143 ?"

public class LargestPrimeFactor {

	public static void main(String[] args) {
		LargestPrimeFactor(600851475143L);
	}

private static void LargestPrimeFactor(long num){
    long largestFactor = 0;
	for(long i = 3; i < num; i++){
		if(num % i == 0 && isPrime(i)){
			largestFactor = i;
		}
	}
    System.out.println(largestFactor);
}

private static boolean isPrime (long factor) {
	if(factor % 2 == 0) return false;
	for(long i = 3; i*i <= factor; i+= 2){
		if(factor % i == 0) return false;
	}
	return true;
}


}




