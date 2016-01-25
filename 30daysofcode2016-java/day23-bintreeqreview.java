import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
static void levelOrder(Node root){
      //Write your code here
    String answer= "";
    // get a queue 
    Queue<Node> levelQ = new LinkedList<Node>();
    // add to queue
    // while queue not empty, dequeue - add children to queue, print data
    if(root == null) return ;
    else 
    {
        // to keep track of node being processed
        Node currNode;
        // add the root to the queue first
        levelQ.add(root);
        // while the queue isn't empty, we still have more tree to traverse
        while(levelQ.peek() != null)
        {
            // take the oldest node off queue
            currNode = levelQ.remove();
            // add the data from the node to the result string
            answer += Integer.toString(currNode.data) + " ";
            // if a left child exists, add to queue before right child
            if(currNode.left != null) levelQ.add(currNode.left);
            // if a right child exists also add to queue
            if(currNode.right != null) levelQ.add(currNode.right);
        }
    }
    // print the answer
    System.out.println(answer);
}
// end of my code
public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
