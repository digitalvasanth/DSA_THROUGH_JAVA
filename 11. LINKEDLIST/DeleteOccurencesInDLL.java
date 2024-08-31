/* I HAVE GIVEN DIRECT FUNCTION OF IT 
 You are given the head_ref of a doubly Linked List and a Key. Your task is to delete all occurrences of the given key if it is present and return the new DLL.
Input: 2<->2<->10<->8<->4<->2<->5<->2 , key=2
Output:  10<->8<->4<->5
 */
public static Node deleteAllOccurrences(Node head, int k) {
    // Write your code here.
    if(head==null)
    return null;

   Node dummy=new Node(-1);
   Node curr=dummy;
   while(head!=null)
   {
       if(head.data!=k)
       {
           curr.next=head;
           curr=curr.next;
           head.prev=curr;
       }
       else
       head.prev=curr;

       head=head.next;
   }
   curr.next=null;

   return dummy.next;
}