import java.io.*;
import java.util.*;

public class Solution {
    // Reversing a string to get R
    public static String reversedistring(String s)
    {
        
        Stack<Character> r = new Stack<Character>();
        // push to stack
        for(int i=0;i<s.length(); i++)
        {
            r.push(s.charAt(i));
        }
        String ans = "";
        // pop automatically in reverse order
        for(int i=0;i<s.length(); i++)
        {
            ans += r.pop();
        }
        return ans;
    }
    
    // Helper to get Ascii value for a char
    static int toAscii(String str, int idx)
    {
        char character = str.charAt(idx); 
        int ascii = (int) character;    
        return ascii;
    }
    
    // returns funny if fits the specified criteria:
    // difference between ascii of indices i and i-1 and
    // ascii of [length - 1- i] and [length - 1 - i - 1]  is same
    public static String funny(String str)
    {
        // reverse input string
        String r = reversedistring(str);
        // for each char
        for(int i = 1; i< str.length() ; i++){
            // index from back to compare against 
            int b_i = str.length() - i - 1;
            int bi = str.length() - i;
            // ascii of back char
            int backi = toAscii(str,bi);
            int back_i = toAscii(str,b_i);
            // taking the difference
            int back_diff = Math.abs(backi - back_i);
            //System.out.println(back_diff);
            // ascii of front char
            int fronti = toAscii(str,i);
            int front_i= toAscii(str,i-1);
            // taking the difference
            int front_diff = Math.abs(fronti - front_i);
            //System.out.println(front_diff);
            if(front_diff != back_diff) return "Not Funny";
        }
        // if passed then 
        return "Funny";
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        String s = sc.nextLine();
        for(int i = 0; i < T; i++)
        {
            //System.out.println("before" + s);
            s = sc.nextLine();
            //System.out.println("after" + s);
            System.out.println(funny(s));
        }
        
    }
}
