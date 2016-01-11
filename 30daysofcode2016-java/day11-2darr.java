import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // given code to read in the matrix
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        // finding the sums of hourglasses
        // array to store hourglass sums
        int n = arr[0].length;
        int glass_sums[] = new int[ (n-2) * (n-2)];
        // placeholder starting max (outside posisble range)
        int maxsum = -10000;
        // loop over potential hourglass middle elements
        for(int i=1; i < n-1;i++){
            for(int j=1; j < n-1;j++){
                // sum the entries in array that correspond to hour glass
                glass_sums[i-1 + j-1] = arr[i][j] 
                                        + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] 
                                        + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                // check for current max sum
                if(glass_sums[i-1+j-1] > maxsum) maxsum = glass_sums[i-1+j-1];
            }
        }
        System.out.println(maxsum);
    }
}

