/*
    Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.   
 */

 public class FindCyclicNode {
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
 


        Node slow=head;
        Node fast=head;
        boolean flag=false;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                flag=true;
                break;
            }
        }
       if(flag==false)
       System.out.println("Null");

       slow=head;
       while(slow!=fast)
       {
            slow=slow.next;
            fast=fast.next;

       }
       if(flag)
       System.out.println("cycle at "+slow.data);
       
     }
 
     


     
 }
 