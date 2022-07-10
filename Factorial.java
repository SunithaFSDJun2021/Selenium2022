package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int userInput=5;
        int fact = 1;
        
        for(int i=1; i<=userInput; i++) {
        	
            fact = fact*i;  
       }
        
        System.out.println(fact);

	}

}
