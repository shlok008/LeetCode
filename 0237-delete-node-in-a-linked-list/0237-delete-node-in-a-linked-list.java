/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode node) {
        ListNode a=node;
        a.val=a.next.val;
        a.next=a.next.next;
        return node;
    }
}