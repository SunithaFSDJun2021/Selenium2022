package week1.day1;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		int inputNumber = 18;
		boolean isPrime = false;
		
		for (int i = 2; i < inputNumber; i++) {
			
			if (inputNumber % i == 0) {
				isPrime= true;
				break;
			}
				
		}
			
		if (!isPrime)
		      System.out.println(inputNumber + " is a prime number.");
		    else
		      System.out.println(inputNumber + " is not a prime number.");
	}

}
