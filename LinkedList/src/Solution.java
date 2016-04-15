
public class Solution {
  
 /*
  *  61. Rotate List. See how if k is more is handled
  *  Given a list, rotate the list to the right by k places, where k is non-negative.

        For example:
        Given 1->2->3->4->5->NULL and k = 2,
        return 4->5->1->2->3->NULL.
  */
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        ListNode fast=head,slow = head;
        while(k--!=0)
        {
            fast=fast.next;
            if(fast==null) fast = head; // handle if k is larger than n
        }
        ListNode next = fast.next;
        fast.next = null;
        fast = next;
        
        while(next.next!=null) next = next.next;
        next.next = head;
        return fast;
    }


  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
