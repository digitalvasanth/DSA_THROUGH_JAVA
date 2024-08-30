/*
 Given a LinkedList of integers. Modify the LinkedList in such a way that in Modified LinkedList all the even numbers appear before all the odd numbers in LinkedList.
 */
public class SegregateOddEven {
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
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        System.out.println("Intital list");
        printLL(head);
        Node newhead=segregate(head);
        System.out.println("after segregation");
        printLL(newhead);

    }

    public static void printLL(Node head)
    {
        if(head==null)
        System.out.println("List is Empty");

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


    public static Node segregate(Node head)
    {
        Node oddlist=new Node(-1);
        Node evenlist=new Node(-1);
        Node oddcurr=oddlist;
        Node evencurr=evenlist;

        while(head!=null)
        {
            if(head.data%2==0)
            {
                evencurr.next=head;
                evencurr=evencurr.next;
            }
            else
            {
                oddcurr.next=head;
               oddcurr=oddcurr.next;
            }
            head=head.next;
        }
        oddcurr.next=null;
        evencurr.next=oddlist.next;

        return evenlist.next;

    }
}
