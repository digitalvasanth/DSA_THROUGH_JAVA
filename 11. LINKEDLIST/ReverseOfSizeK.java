/*
 Original Linked List: 5 4 3 7 9 2 , K = 4
Linked List Reversed in groups of 4: 7 3 4 5 9 2 
 */
public class ReverseOfSizeK{

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
        int arr[]={5,4,3,7,9,2};
        int k=4;
        Node head=new Node(arr[0]);

        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head.next.next.next.next.next=new Node(arr[5]);

        System.out.println("before reverse");
        printLL(head);
        Node newhead=reverseK(k,head);
        printLL(newhead);
    }

    public static Node reverseK(int k, Node head)
    {

        Node temp=head;
        Node prevlast=null;
        while(temp!=null)
        {
            Node knode=getkthnode(k, temp);

            if(knode==null)
            {
                if(prevlast!=null)
                prevlast.next=temp;

                break;
            }
            Node nextnode=knode.next;
            knode.next=null;
            reverse(temp);

            if(temp==head)
            {
                head=knode;
            }
            else
            prevlast.next=knode;

            prevlast=temp;
            temp=nextnode;
        }
        return head;
       
    }

    public static Node getkthnode(int k, Node temp)
    {
       k-=1;

       while(temp!=null&&k>0)
       {
        temp=temp.next;
        k--;
       }
       return temp;

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