import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // staircase height
        String spaces;
        String stairs;
        String prnt_string;
        for(int i = N; i > 0; i--){
            // replicating a string i-1 times: here the empty string
            spaces = new String(new char[i - 1]).replace("\0", " ");
            // replicating a string N-i+1 times: here the # string for stairs
            stairs = new String(new char[N - i + 1]).replace("\0", "#");
            // concatenating the parts of the string
            prnt_string = spaces + stairs;
            // printing to stdout
            System.out.println(prnt_string);
        }
    }
}
