/*

Input:Linked List: 3 4 2 1 5
Output:Sorted List: 1 2 3 4 5
 */
import java.util.*;
public class SortList {
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
        Node head=new Node(5);
        head.next=new Node(4);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);
         System.out.println("Before Sort");
         printLL(head);
         Node newhead=sort(head);
         System.out.println("After sort");
         printLL(newhead);

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
    public static Node sort(Node head)
    {
        ArrayList<Integer>list=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        Node sorted=new Node(list.get(0));
        Node curr=sorted;
        for(int i=1;i<list.size();i++)
        {
            Node nn=new Node(list.get(i));
           curr.next=nn;
           curr=curr.next;
        }
        return sorted;
    }

}
