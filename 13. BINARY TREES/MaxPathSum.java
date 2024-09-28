public class MaxPathSum {
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
       System.out.println(maxpathsum(root));
    }
   public static int maxpathsum(Node root) {
        if(root==null)
            return 0;
        int ans[]=new int[1];
        ans[0]=Integer.MIN_VALUE;
        find(root,ans);

        return ans[0];
    }

    public static int find(Node root,int arr[])
    {
        if(root==null)
            return 0;

        int l=Math.max(0,find(root.left,arr));
        int r=Math.max(0,find(root.right,arr));

        arr[0]=Math.max(arr[0],l+r+root.data);

        return Math.max(l,r)+root.data;
            }
}
