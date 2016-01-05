import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of input rows
        // Reading in the three numbers for each of T input rows
        for(int lines =0 ; lines < T; lines++)
        {
            int a = sc.nextInt(); // constant
            int b = sc.nextInt(); // linear term
            int N = sc.nextInt(); // number of terms
            // String to hold the output
            String ans="";
            // Building the output line of increasing numbers
            int num = a;
            // increasing polynomially each time
            for(int i = 0;i < N; i++){
                num +=(Math.pow(2, i)*b);
                ans += Integer.toString(num) + " ";
            }
            // ...then print!
            System.out.println(ans);
        }
    }
}
