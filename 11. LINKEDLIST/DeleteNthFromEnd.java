/*
Input Format: 1->2->3->4->5, N=3
Result: 1->2->4->5
 */
public class DeleteNthFromEnd {
    
    public static class Node{
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
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        System.out.println("Before deletion");
        printLL(head);
        System.out.println("After Deletion");
        Node newhead=delete(N,head);
        printLL(head);
    }

    public static void printLL(Node head)
    {
        while(head!=null)
        {
            if(head.next!=null)
            {
                System.out.print(head.data+"-> ");
                
            }
            else
            System.out.print(head.data);
            head=head.next;
        }
        System.out.println();
    }

    public static Node delete(int pos,Node head)
    {
        Node temp=head;
        int len=0;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }

        if(len==pos)
        return head.next;

        int actualpos=len-pos;
        Node curr=head;
        while(actualpos>1)
        {
            actualpos--;
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
