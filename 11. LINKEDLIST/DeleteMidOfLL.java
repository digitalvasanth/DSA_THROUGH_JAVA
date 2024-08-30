/*
Input Format LL: 1  2  3  4  5 
Output: 1 2 4 5
 */
public class DeleteMidOfLL {
    
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String [] args)
    {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.println("Before Deletion");
        printLL(head);
        System.out.println("after deletion");
        deletemid(head);
        printLL(head);


    }
    public static void printLL(Node head)
    {
        while(head!=null)
        {
            if(head.next!=null)
            System.out.print(head.data+"-> ");
            else
            System.out.print(head.data);
            head=head.next;
        }
        System.out.println();
    }
    public static Node deletemid(Node head)
    {
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null&&fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            break;
            
        }
        prev.next=prev.next.next;
        return head;
    }
}
