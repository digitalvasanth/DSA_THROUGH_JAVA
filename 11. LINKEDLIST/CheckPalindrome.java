/*
Input Format: LL: 1  2  3  2  1
Output : True

 1. ( BRUTE FORCE )
 public static boolean check(Node head)
    {
        Stack<Integer>st=new Stack<>();

        Node temp=head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(temp.data!=st.peek())
            return false;
            st.pop();
            temp=temp.next;
        }
        return true;
    }
 */
// 2. ( OPTIMAL )
public class CheckPalindrome
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String [] args)
    {
        int arr[]={1,2,3,2,1};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);

        if(check(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not an Palindrome");
    }

    public static boolean check(Node head)
    {
        
        Node left=head;
        Node mid=findmid(head);
        Node right=reverse(mid.next);

        while(right!=null)
        {
            if(left.data!=right.data)
                return false;

                left=left.next;
                right=right.next;
        }

        return true;
    }

    public static Node findmid(Node head)
    {
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null&&fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return prev;
    }

    public static Node reverse(Node head)
    {
        if(head==null||head.next==null)
        return head;

        Node rt=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return rt;
    }
}