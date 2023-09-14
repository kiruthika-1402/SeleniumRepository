package week1.assignments;

public class IsPrimeNumber {
	
	public void IsPrime(int num) {
		
		boolean flag = false;
		
		if (num<=1) {
			
			flag = false;
			
			for (int i = 2; i < num/2; i++) {
				
				if (num % i ==0) {
					
					System.out.println("It's not a prime number "+num);	
				}
			}
			
		} else {
			
			System.out.println("It's a prime number "+ num);

		}
	}

	public static void main(String[] args) {
		
		IsPrimeNumber primenumber = new IsPrimeNumber();
		primenumber.IsPrime(5);
		
	
		
		
		

	}

}
