
public class ReverseList {
    
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

