import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
             //Write your code
          try{
              // to check if a regex pattern is valid
              Pattern.compile(pattern);
              System.out.println("Valid");
          }
          // catching exception if not valid
          catch(Exception e){
              System.out.println("Invalid");
          }
      }
   }
}

