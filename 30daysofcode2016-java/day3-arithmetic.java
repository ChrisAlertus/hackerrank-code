import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      // Enter your code here!
      // Run some computations....
      double tip = (M*T)/100;
      double tax = (M*X)/100;
      double tot = tip + tax + M;
      int total = (int) Math.round(tot);
      
      // ...then print!
      System.out.format("The final price of the meal is $%d.", total);
    }
}
