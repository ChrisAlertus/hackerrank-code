import java.util.*;
import java.io.*;
//Write your code here
class Calculator {
    public int power(int n,int p) throws NegativeArgument
    {
        if(!(n >= 0 && p >= 0))  throw new NegativeArgument();
        int ans = 1;
        for(;p > 0;p--){
            ans*=n;
        }
        //System.out.println(ans);
        return ans;
    }      
}

class NegativeArgument extends Exception
{
   public String getMessage()
   {
      return "n and p should be non-negative";
   }
}
// end of my code
class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}

