/*
Input:
	head = [1,2,3,4,5] 
	k = 2
Output:
 head = [4,5,1,2,3]
Explanation:
 We have to rotate the list to the right twice.


 1. (  USING EXTRA SPACE)

 public static Node rotate( int k,Node head) {

        if(head==null||head.next==null||k==0)
            return head;

        ArrayList<Integer>list=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            list.add(temp.data);
            temp=temp.next;
        }
        int n=list.size();
        k=k%n;
        if(k==0)
        return head;
        Node dummy =new Node(-1);
        Node curr=dummy;
        for(int i=0;i<list.size();i++)
        {
            Node nn=new Node(list.get((i-k+n)%n));
            curr.next=nn;
            curr=curr.next;
        }
        curr.next=null;

        return dummy.next;
    }


 */
// 2. WITHOUT USING EXTRA SPACE 

public class RotateByK {
    
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
        int k=2;
        Node head=new Node(arr[0]);

        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);

        System.out.println("Before Rotation");
        printLL(head);
        System.out.println("After Rotation");
        Node newhead=rotate(k,head);
        printLL(newhead);
    }


   public static Node rotate( int k,Node head) {

        if(head==null||k==0)
            return head;

       
       int len=1;
       Node tail=head;
       while(tail.next!=null)
       {
        tail=tail.next;
        len++;
       }
       
       if(k%len==0)
        return head;
       k=k%len;

       tail.next=head;
       Node newnode=getnode(len-k,head);
      head= newnode.next;
      newnode.next=null;

      return head;
    }

    public static Node getnode(int k,Node temp)
    {
        int c=1;
        while(temp!=null)
        {
            if(c==k)
            return temp;
            c++;
            temp=temp.next;

        }
        return temp;
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

