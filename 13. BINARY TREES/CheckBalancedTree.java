public class CheckBalancedTree {
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
         System.out.println(check(root));
         
     }
 
 public static boolean check(Node root)
{
    return FindHeight(root)!=-1;
}
     public static int FindHeight(Node root)
     {
         if(root==null)
             return 0;
         int l=FindHeight(root.left);
         if(l==-1)
            return -1;
        
         int r=FindHeight(root.right);
         if(r==-1)
            return -1;
        if(Math.abs(l-r)>1)
            return -1;
         return 1+Math.max(l,r);
     }
 }