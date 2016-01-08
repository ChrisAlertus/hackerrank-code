//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      // reading number of friends
      int n=in.nextInt();
      in.nextLine();
       // map to store name-number pairs
       Map<String, String> map = new HashMap<String, String>();
      // reading info for those first friends
      for(int i=0;i<n;i++)
      {
          String name=in.nextLine();
          int phone=in.nextInt();
          // HashMap of phone directory
          map.put(name, Integer.toString(phone));
          in.nextLine();
      }
      // after adding friends, now querying for phonenumbers
      while(in.hasNext())
      {
          String s=in.nextLine();
          if(map.containsKey(s)) {
              s += "=" + map.get(s);
              System.out.println(s);
          }
          else System.out.println("Not found");
      }
   }
}
