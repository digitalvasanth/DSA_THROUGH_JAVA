public class SearchElement {
    
    public static class Node
    {
        int data;
        Node next;

        Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String [] args)
    {
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val=3;

        if(check(val,head))
            System.out.println("present");
        else
            System.out.println("Not present");

    }

    public static boolean check(int data,Node head)
    {
        if(head==null)
        return false;
        Node temp=head;

        while(temp!=null)
        {
            if(temp.data==data)
                return true;

            temp=temp.next;
        }
        return false;

    }
}
