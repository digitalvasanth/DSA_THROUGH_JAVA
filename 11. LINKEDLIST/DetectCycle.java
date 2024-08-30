/*
 1. ( BRUTE FORCE )
 public static boolean detect(Node head)
    {
        Node temp=head;
       HashSet<Node>set=new HashSet<>();

       while(temp!=null)
       {
        if(set.contains(temp))
        return true;
        else
        set.add(temp);

        temp=temp.next;
       }
       return false;
    }
 */

 // 2. ( OPTIMAL )
import java.util.*;
public class DetectCycle {
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
       Node second=new Node(2);
       Node third=new Node(3);
       Node fourth=new Node(4);
       Node fifth=new Node(5);

       //making a cyclic linked list by linking last node to third node
       head.next=second;
       second.next=third;
       third.next=fourth;
       fourth.next=fifth;
       fifth.next=third;

       if(detect(head))
        System.out.println("Yes cycle is present");
    else
        System.out.println("No cycle ");
    }

    public static boolean detect(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            return true;
        }
        return false;
    }
}
