/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) 
    {
        ListNode m=a;
        ListNode n=b;
        HashMap<ListNode,Boolean> map=new HashMap<>();
        while(m!=null)
        {
            map.put(m,true);
            m=m.next;
        }
        while(n!=null){
            if(map.get(n)!=null)
                return n;
            n=n.next;
        }
        return null;
        
    }
}

/*ListNode t=a;
        while(t!=null)
        {
            ListNode ptr=b;
            while(ptr!=null && ptr!=t) ptr=ptr.next;
            if(ptr==null) t=t.next;
            else return t;
        }
        return null;
        */