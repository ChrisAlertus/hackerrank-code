import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers= new int[N];
        int n;
        for(int i=0;i < N;i++){
            n = sc.nextInt();
            numbers[i] = n;
        }
        Arrays.sort(numbers);
        
        int mindiff = 1000000000;
        String mindiffstring = "";
        int diff;
        for(int i = 0; i < N-1; i ++){
            // calculate difference
            diff = Math.abs(numbers[i] - numbers[i+1]);
            // if new minimum, print that
            if(diff < mindiff) {
                mindiff = diff;
                mindiffstring = Integer.toString(numbers[i]) + " " + Integer.toString(numbers[i+1]) + " ";
            } else if (diff == mindiff) { 
                // minimum equal then add to the string of results
                mindiffstring += Integer.toString(numbers[i]) + " " +
                                        Integer.toString(numbers[i+1]) + " ";
            } else {
                continue;
            }
        }
        // print result
        System.out.println(mindiffstring);
           
        
    }
}
