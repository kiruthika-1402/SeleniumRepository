package week1.assignments;

import java.util.Arrays;
import java.util.Iterator;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] arr = {1,4,3,2,8,6,7};
		
		Arrays.sort(arr);
		
		int n = arr.length+1;
		
		int NaturalNumbers = (n * (n + 1)) / 2;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			NaturalNumbers = NaturalNumbers - arr[i];
		}
		
		System.out.println("Missing element is "+NaturalNumbers);

	}

}
