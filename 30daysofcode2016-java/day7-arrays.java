import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        // Solution
        // for each, print the number indexed by the array numbers
        String soln = "";
        // loop through list from end, forward
        for(int i=N-1; i>= 0;i--){
            // buuild output string
            soln += Integer.toString(arr[i]) + " ";
        }
        // print to stdout
        System.out.println(soln);
    }
}

