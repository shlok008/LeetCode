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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        else
        {
            ListNode a=head;
            ListNode b=head.next;
            a.next=null;
            while(b.next!=null)
            {
                ListNode t=b.next;
                b.next=a;
                a=b;
                b=t;
            }
            b.next=a;
            head=b;
        }
        return head;
    }
}