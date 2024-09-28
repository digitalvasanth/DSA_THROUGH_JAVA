/*
O(N^2) solution
 public static int FindDiameter(Node root)
 {
    if(root==null)
        return 0;
    int d1=FindHeight(root);
    int d2=FindHeight(root.left);
    int d3=FindHeight(root.right);

    return Math.max(d1,Math.max(d2,d3));

 }
     public static int FindHeight(Node root)
     {
         if(root==null)
             return 0;
         int l=FindHeight(root.left);
         int r=FindHeight(root.right);
         return 1+Math.max(l,r);
     }
 */
// OPTIMISED O(N)

import javax.swing.tree.TreeNode;

public class DiameterOfTree {
    public static class Node
     {
         int data;
         Node left;
         Node right;
         public  Node(int data)
         {
             this.data=data;
             this.left=null;
             this.right=null;
         }
     }
     public static Node generateTree(int arr[])
     {
         Node root=null;
         for(int i:arr){
         if(i!=-1)
         root=insert(i,root);
         }
         return root;
     }
     public static Node insert(int data, Node root)
     {
         if(root==null)
             return new Node(data);
         if(data<root.data)
             root.left=insert(data,root.left);
         else if(data>root.data)
             root.right=insert(data,root.right);
 
         return root;
     }
     public static void main(String args[])
     {  
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         System.out.println(FindDiameter(root));
         
     }
   public static  int FindDiameter(Node root) {
        if(root==null)
            return 0;
        int d[]=new int[1];
        height(root,d);
        return d[0];
    }
    public static int height(Node root,int d[])
    {
        if(root==null)
            return 0;
        int l=height(root.left,d);
        int r=height(root.right,d);

        d[0]=Math.max(d[0],l+r);
        return 1+Math.max(l,r);
    }
 }