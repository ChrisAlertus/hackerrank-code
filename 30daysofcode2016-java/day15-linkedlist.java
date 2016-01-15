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
// my Code
    public static  Node insert(Node head,int data)
	{
  	//Complete this method
        // save pointer to list head
        Node currNode = head;
        // if null pointer, return new node
        if (currNode == null) return new Node(data);
        // else, find end of list
        while(currNode.next != null){
            currNode = currNode.next;
        } 
        // make end of list point to new node with data
        currNode.next = new Node(data);
        // return head of list
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
          int N=sc.nextInt();
          while(N-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);

   }
}
