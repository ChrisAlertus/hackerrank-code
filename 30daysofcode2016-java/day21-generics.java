import java.io.IOException;
import java.lang.reflect.Method;
class Printer
{
   //Write your code here
    // declaring a generic input array
    public <T> void printArray(T[] array)
    {
        // looping over array elements
        for(int i=0 ; i< array.length; i++)
        {
            // printing to stdout
            System.out.println(array[i]);    
        }
    }
}
// end of my code
public class Solution
{
    

    public static void main( String args[] )
    {
        Printer myPrinter=new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        myPrinter.printArray( intArray  );
        myPrinter.printArray( stringArray );
        int count=0;
		for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;

    } 
}
