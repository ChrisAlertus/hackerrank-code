import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
// My Code
// Add your code here
    Difference(int[] elems){
        elements = elems;
        maximumDifference = 0;
    }
    
    void computeDifference(){
        // to store the differences being computed
        int diff;
        // looping over first values on left of subtraction sign
        for(int i= 0; i< elements.length; i++){
            // looping over right values of subtraction sign
            for(int j = i + 1; j < elements.length; j++){
                // calculating the abs difference
                diff = Math.abs(elements[i] - elements[j]);
                // if it is larger than seen so far, update
                if(diff > maximumDifference) maximumDifference = diff;
            }
        }
    }
// end of my code
} // End of Difference Class

public class Solution {        
  	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] a = new int[N];
    
    	for (int i = 0; i < N; i++) {
    		a[i] = sc.nextInt();
    	}

      	Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
   }
}
