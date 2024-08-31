/*
Input: LinkedList: 4->5->6
Output: 457
 */
public class Add1ToNumber {
    public static class Node{
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
        

        Node head1=new Node(4);
        head1.next=new Node(5);
        head1.next.next=new Node(6);
       
        Node ans=add1(head1);
        printLL(ans);
         
        
    }
    public static Node add1(Node head)
    {
        int carry=1;
        int sum=0;
        Node temp=reverse(head);
        Node dummy =new Node (-1);
        Node curr=dummy;
        while(temp!=null)
        {
            sum=temp.data+carry;
            carry=sum/10;
            Node nn=new Node(sum%10);
           curr.next=nn;
           curr=curr.next;
           temp=temp.next;

        }

        if(carry!=0)
        {
            Node nn=new Node(carry);
            curr.next=nn;
            nn.next=null;

        }
        Node ans=reverse(dummy.next);
        return ans;
       
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
    public static Node add(Node h1,Node h2)
    {
        int sum=0;
        int carry=0;

        Node curr1=reverse(h1);
        Node curr2=reverse(h2);
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(curr1!=null&&curr2!=null)
        {
            sum=curr1.data+curr2.data+carry;
            carry=sum/10;
            Node nn=new Node(sum%10);
            temp.next=nn;
            temp=temp.next;
            curr1=curr1.next;
            curr2=curr2.next;
        }

        while(curr1!=null)
        {
            sum=curr1.data+carry;
            carry=sum/10;
            Node nn=new Node(sum%10);
            temp.next=nn;
            temp=temp.next;
        }
        while(curr2!=null)
        {
            sum=curr2.data+carry;
            carry=sum/10;
            Node nn=new Node(sum%10);
            temp.next=nn;
            temp=temp.next;
        }
        if(carry!=0)
        {
            Node nn=new Node(carry);
            temp.next=nn;
            nn.next=null;
        }
        Node ans=reverse(dummy.next);
        return ans;

    }


    public static void printLL(Node head)
    {
        if(head==null)
        System.out.println("List is empty");

        while(head!=null)
        {
            if(head.next!=null)
        System.out.print(head.data+"-> ");
        else
        System.out.println(head.data);
        head=head.next;
        }
        System.out.println();
    }
}
