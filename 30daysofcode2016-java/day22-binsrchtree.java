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
public static int getHeight(Node root){
      //Write your code here 
      // at null root, no entries so height 0 
      // OR at recursive call to a null child, already added one to
      // height count in recursive call
      if(root == null)
      {
        return 0;    
      }
      // if the children are both null, at a leaf hence 
      // add one for the last level of depth
      else if(root.left == null && root.right == null) return 1;
      else
      {
        // height is the max height of the two children
        return Math.max(1 + getHeight(root.left), 1 + getHeight(root.right));    
      }
    }
// my code ends here
public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur=new Node(data);
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
