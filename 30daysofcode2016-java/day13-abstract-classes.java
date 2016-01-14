import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}
//Write MyBook Class
// not declared public: must specify that it is a "Book" for polymorphism and inheritance
class MyBook extends Book
{
    // protecting from client tampering
    private int price;
    MyBook(String t, String a, int p){
        super(t,a);
        price= p;        
    }    
    
    // function to display the book information.
    // Pure Virtual function hence must be implemented (I think - not sure java syntax)
    void display(){
        // printing in required format 
        System.out.println("Title: " + this.title + "\n" +
                           "Author: " + this.author + "\n" +
                           "Price: " + Integer.toString(this.price));
    }
}
// end of my code
public class Solution
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}
