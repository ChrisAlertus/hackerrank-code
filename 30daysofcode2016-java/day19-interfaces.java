import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
   int divisorSum(int n);
}
// 
//Write your code here
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n){
        // to accumulae the sum of divisors
        int sum = 0;
        // to increment and find divisors
        int i = 1;
        // divisors must be less than or equal to the number
        while(i <= n)
        {
            // if it divides clealy, then a divisor
            if(n % i == 0) sum += i;
            i++;
        }
        return sum;
    }
    
}
// end of my code
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}
