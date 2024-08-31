/*
Input: List 1 = [1,3,1,2,4], List 2 = [3,2,4]
Output: 2
 */
import java.util.*;
public class FindIntersectionOfTwoLists {
    
    public static class Node
    {
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
            Node head = null;
            head=new Node(1);
            head.next=new Node(3);
            head.next.next=new Node(1);
            head.next.next.next=new Node(2);
            head.next.next.next.next=new Node(4);
            Node head1 = head;
            head = head.next.next.next;
            Node headSec = null;
            headSec=new Node(3);
            Node head2 = headSec;
            headSec.next = head;

            Node ans=findNode(head1,head2);
            System.out.println(ans.data);
        }

        public static Node findNode(Node head1, Node head2)
        {
            Stack<Node>s1=new Stack<>();
            Stack<Node>s2=new Stack<>();
            Node lastpopped=null;
            while(head1!=null)
            {
                s1.push(head1);
                head1=head1.next;
            }
            while(head2!=null)
            {
                s2.push(head2);
                head2=head2.next;
            }
            while(!s1.isEmpty()&&!s2.isEmpty())
            {
                if(s1.peek()==s2.peek())
                {
                    lastpopped=s1.peek();
                }
                s1.pop();
                s2.pop();
            }
            return lastpopped;
        }
     

}


    

