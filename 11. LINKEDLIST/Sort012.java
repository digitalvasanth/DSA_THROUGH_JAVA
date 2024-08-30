public class Sort012 {
    
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
        head.next=new Node(0);
        head.next.next=new Node(1);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(0);
        head.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(1);
        System.out.println("Before sort");
        printLL(head);
        Node newhead=sort(head);
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

    public static Node sort(Node head)
    {
        int zero=0;
        int one=0;int two=0;

        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==0)
            zero++;
            else if(temp.data==1)
            one++;
            else
            two++;
            
            temp=temp.next;
        }

        temp=head;
        while(temp!=null)
        {
            if(zero!=0){
            temp.data=0;
            zero--;
            }
            else if(one!=0){
            temp.data=1;
            one--;
            }
            else
            {
                temp.data=2;
                two--;
            }
            temp=temp.next;
        }
        return head;
    }
}
