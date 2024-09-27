
/*
1. USING RECURSION
public static void helper(Node root, List<Integer>ans)
    {
        if(root==null)
            return ;

        
        helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.data);
        
    }
*/
// 2. USING 2 STACKS
import java.util.*;
public class PostOrder {
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
        System.out.println("Post-Order Traversal");
        List<Integer>ans=PostOrder(root);
        for(int i:ans)
        System.out.print(i+" ");

    }
    
    public static List<Integer>PostOrder(Node root)
    {
        List<Integer>ans=new ArrayList<>();
        if(root==null)
            return ans;
        Stack<Node>st1=new Stack<>();
        Stack<Node>st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty())
        {
            root=st1.pop();
            st2.push(root);
            if(root.left!=null)
                st1.push(root.left);
            if(root.right!=null)
                st1.push(root.right);
        }

        while(!st2.isEmpty())
            ans.add(st2.pop().data);
        return ans;
    }
}
