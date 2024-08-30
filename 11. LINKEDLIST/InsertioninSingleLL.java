
public class InsertioninSingleLL {
    
    public static class Node
    {
        int data;
        Node next;

       public Node(int data){
        this.data=data;
        this.next=null;
        }
    }

    public static void main(String [] args)
    {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(5);

        int val=100;
        System.out.println("Before Insertion");
        printLL(head);
        //Node h1=insertAthead(val,head);
       //Node h2=insertAtEnd(val, head);
        Node h3=insertAtpos(val,2,head);
        System.out.println("After Insertion at Head");
        printLL(h3);

    }

    public static Node insertAthead(int data,Node head)
    {
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
        return head;
    }


    public static void printLL(Node head)
    {
        if(head==null)
        System.out.println("List is Empty");

        while(head!=null)
        {
            System.out.print(head.data+"-> ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node insertAtEnd(int data, Node head)
    {
        Node nn=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        temp=temp.next;

       temp.next=nn;

       return head;


    }

    public static Node insertAtpos(int data,int pos, Node head)
    {

            if(pos<1||pos>length(head))
                System.out.println("Invalid");
            if(pos==1)
                return insertAthead(data, head);
          else
          {
            Node nn=new Node(data);
            int i=0;
            Node temp=head;
            while(i<pos-2)
            {
                temp=temp.next;
                i++;
            }
            nn.next=temp.next;
            temp.next=nn;
           
          }
          return head;
           
    }

    public static int length(Node head)
    {
        if(head==null)
        return 0;
        int c=0;
        while(head!=null)
        {
            c++;
            head=head.next;
        }
        return c;
    }
}
