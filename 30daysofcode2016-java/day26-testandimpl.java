import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // reading input
        Scanner sc = new Scanner(System.in);
        // storing actual date
        int[] actual = new int[3];
        for(int i=0; i < 3; i++){
            actual[i] = sc.nextInt();
        }
        // storing expected date
        int[] expected = new int[3];
        for(int i=0; i < 3; i++){
            expected[i] = sc.nextInt();
        }
        // checking against return date
        // late a year
        if(actual[2] > expected[2]) System.out.println( 10000);
        // otherwise same yeat
        else if(actual[2] == expected[2]) {
            // late a month
            if (actual[1] > expected[1]) System.out.println(500 * (actual[1] - expected[1]));
            // otherwise same month
            else if(actual[1] == expected[1]){
                // ;late days
                if(actual[0] > expected[0]) System.out.println(15* (actual[0] - expected[0]));
                // otherwise on time
                else System.out.println(0);
            }
            // otherwise on time
            else System.out.println(0);
        }
        // otherwise on time
        else System.out.println(0);
    }
}
