/*
 Problem Statement: Given a linked list containing ‘N’ head nodes where every node in the linked list contains two pointers:
‘Next’ points to the next node in the list
‘Child’ pointer to a linked list where the current node is the head
Each of these child linked lists is in sorted order and connected by a 'child' pointer. Your task is to flatten this linked list such that all nodes appear in a single layer or level in a 'sorted order'.





                
 */
public class FlatteningLL {
    
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
        int arr[]={1,2,3,4,5};

        Node head=new Node(arr[0]);

        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);

        System.out.println("Before Reversing");
        printLL(head);
        System.out.println("After Reversing");
        Node newhead=reverse(head);
        printLL(newhead);
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

