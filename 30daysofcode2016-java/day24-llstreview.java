import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{
// code start
 public static Node removeDuplicates(Node head) {
      //Write your code here
        if(head != null) 
        {
            // store current node 
            Node currNode = head;
            // store the first next
            Node nextNode = head.next;
            // iterate over list until end
            while(nextNode != null)
            {
                // if a duplicate
                if(currNode.data == nextNode.data) {
                    // link current node to the successor of current successor
                    currNode.next = nextNode.next;
                    nextNode = currNode.next;
                    //currNode = currNode.next;
                    // if new next is a node, update next node
                    //if(currNode != null) nextNode = currNode.next;
                    //else nextNode = null;
                }
                else {
                    // here no duplicate so update current
                    currNode = nextNode;
                    // update next and since current always a node, it will have a defined next
                    nextNode = currNode.next;

                }   
            }
        }
        // return pointer to front of llist
        return head;
    }
// end of code
 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }
