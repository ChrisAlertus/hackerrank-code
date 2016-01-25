import java.io.*;
import java.util.*;

public class Solution {

    //isPrime fn
    public static void isPrime(int num)
    {
        double sqrt = Math.sqrt((double)num);
        if(num == 2) {
            System.out.println("Prime"); 
            return;
        }
        if(num < 2) {
            System.out.println("Not prime"); 
            return;
        }
        for(int i =2 ; i <= sqrt; i++)
        {
            if(num % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //getting the initial input
        for(int i = 0;i< n; i++){
            // prime check
            isPrime(sc.nextInt());
        }

        
    }
}
