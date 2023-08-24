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
    public boolean isPalindrome(ListNode head) {
        int n=0,r=0,c=1;
        while(head!=null)
        {
            n=n*10+head.val;
            r=head.val*c+r;
            c*=10;
            head=head.next;
        }
        System.out.print(n+"\t"+r);
        if(n==r)
        return true;
        return false;
    }
}