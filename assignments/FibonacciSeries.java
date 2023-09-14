package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 8;
		
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);

	//             1      2      7
		for (int i = 0; i < n-2 ; i++) {
			
	//               3		
			int c = a+b;
			
	//               4		
			System.out.println(c);
	//       5		
			a=b;
			
	//       6		
			b=c;		
		}	
		
	}

}
