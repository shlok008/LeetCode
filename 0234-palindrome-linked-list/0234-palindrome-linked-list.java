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
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null)
        {
            a.add(head.val);
            head=head.next;
        }
        int i=0;
        int j=a.size()-1;
        while(i<j)
        {
            if(a.get(i++)!=a.get(j--)) return false;
        }
        return true;
        
    }
}