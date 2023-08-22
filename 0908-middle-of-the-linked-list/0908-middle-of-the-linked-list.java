/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(b.next!=null && b.next.next!=null)
        {b=b.next.next;a=a.next;}
        if(b.next==null) 
            return a;
        return a.next;
    }
}