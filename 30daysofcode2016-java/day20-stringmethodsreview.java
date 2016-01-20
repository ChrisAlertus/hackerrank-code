    
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner sc = new Scanner(System.in);
        // reading full line from stdin
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String Str = in.readLine();
        //String[] answer = Str.split("[ \\]!\\[,\\?.\\_'@\\+]+");
        // handling empty input
        if(Str != null)
        {
            //String[] answer = Str.split("[^a-zA-Z]+");
            //String[] answer = StringTokenizer(Str,"![,?.\\_'@+]");
            // splitting string based on regex matches
            StringTokenizer answer = new StringTokenizer(Str,"[!,?.\\_'@ ]+"); 
            // number of tokens
            //int n = answer.length;
            int n = answer.countTokens();
            // printing answer to stdout
            System.out.println(n);
            for(int i=0;i< n; i++){
                System.out.println(answer.nextToken());
            }
        }
        else{
            // output if no input fed 
            System.out.println(0);
        }
           
    }
}



