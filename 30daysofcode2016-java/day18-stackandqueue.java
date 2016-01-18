import java.io.*;
import java.util.*;
class Palindrome {
    //Write your code here
    // stack: easy mode
    Stack<Character> letterStack = new Stack<Character>();
    // queue: easy mode
    Queue<Character> letterQueue = new LinkedList<Character>();
    //Pushes a character onto a stack.
    void pushCharacter(char ch)
    {
        // adds to top of collection 
        letterStack.push(ch);    
    }
    //Enqueues a character in a queue.
    void enqueueCharacter(char ch)
    {
        // adds to end of collection
        letterQueue.add(ch);    
    }
    //Pops and returns the top character.
    char popCharacter()
    {    
        // returns last added element
        return letterStack.pop();   
    }
    //Dequeues and returns the first character.
    char dequeueCharacter()
    {
        // returns first added element
        return letterQueue.remove();    
    }
}
// end of my code
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();
        
        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }
        
        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
        boolean f = true;
        
        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;
                
                break;
            }
        }
        
        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }
}
