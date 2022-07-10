package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		
				int firstNumber =0;
				int secondNumber= 1;
				int sum = 0;
				
				System.out.println(firstNumber);
				System.out.println(secondNumber);
				
				for (int i = 0; i < 9; i++) {
					sum = firstNumber+secondNumber;
					System.out.println(sum);
					firstNumber = secondNumber;
					secondNumber = sum;
								
				}
			}
	

	}


