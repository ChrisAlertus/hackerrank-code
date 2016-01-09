import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // getting integers from input
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Take Input
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
   static  int find_gcd(int a,int b){
        //Write the base condition
        if(b == 0) return a;
        else if(b < a) return find_gcd(b,a%b);
        else return find_gcd(a,b%a);
   }
}

