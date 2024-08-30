
public class DeleteANode {
    
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
        head.next.next.next.next=new Node(arr[4]);

        System.out.println("Before Deletion");
        printLL(head);
        System.out.println("after Deletion");
        Node t=getNode(3,head);
        delete(t);
        printLL(head);
        
    }
    public static Node getNode(int val,Node head)
    {
        if(head==null)
            return null;
        while(head.data!=val)
        {
            head=head.next;
        }
        return head;
    }

    public static void delete (Node t)
    {
        t.data=t.next.data;
        t.next=t.next.next;
    }
    public static void printLL(Node head)
    {
        if(head==null)
        System.out.println("List is Empty");

        while(head!=null)
        {
            if(head.next!=null)
            System.out.print(head.data+"-> ");
            head=head.next;
        }
        System.out.println();
    }
}
