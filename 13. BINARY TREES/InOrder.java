import java.util.*;
public class InOrder {
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
    
    
    public static void main(String args[])
    {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("In-Order Traversal");
        List<Integer>ans=Inorder(root);
        for(int i:ans)
        System.out.print(i+" ");

    }
    
    public static List<Integer>Inorder(Node root)
    {
        List<Integer>ans=new ArrayList<>();
       helper(root,ans);
       return ans;
       
    }
    public static void helper(Node root, List<Integer>ans)
    {
        if(root==null)
            return ;

        
        helper(root.left,ans);
        ans.add(root.data);
        helper(root.right,ans);
    }
}
