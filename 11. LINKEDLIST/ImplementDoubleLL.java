
public class ImplementDoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data,Node next,Node prev)
        {
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
        Node (int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4};
        Node head=new Node(arr[0]);
        Node prev=head;
       for(int i=1;i<arr.length;i++)
       {
        Node nn=new Node(arr[i],null,prev);
        prev.next=nn;
        prev=nn;

       }
       printDLL(head);


    }
    public static void printDLL(Node head)
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
    }
}
