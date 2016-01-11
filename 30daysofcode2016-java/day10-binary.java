import java.io.*;
import java.util.*;

public class Solution {
      // Function to convert to a binary string
    
    public static void print_binary(int n){
        Stack<String> s = new Stack<String>();
        String digit;
        while(n > 0){
            digit = Integer.toString(n % 2);
            s.push(digit);
            n /= 2;
        }
        String ans= "";
        while(!s.empty()){
            ans += s.pop();
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // reading number of lines
        Scanner in = new Scanner(System.in);
        int T= in.nextInt();
        // Printing binary numbers
        for(int i=0; i< T; i++){
            int curr_num = in.nextInt();
            print_binary(curr_num);         
        }
        
    }
}
