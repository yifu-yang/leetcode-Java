/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode n = null;
        for(int i =0;i<lists.length;i++){
            if(i==0){
                n = lists[i];
                continue;
            }
            n = merge2(n,lists[i]);
        }
        return n;
    }
    
    public ListNode merge2(ListNode m,ListNode n){
        ListNode result = null;
        ListNode curr = result;
        if(m==null||n==null){
            return m==null?n:m;
        }
        while(m!=null&&n!=null){
            if(m.val<n.val){
                if(result == null){
                    result = new ListNode(m.val);
                    curr = result;
                }else{
                    curr.next = new ListNode(m.val);
                    curr = curr.next;
                }
                m = m.next;
            }else{
                if(result == null){
                    result = new ListNode(n.val);
                    curr = result;
                }else{
                    curr.next = new ListNode(n.val);
                    curr = curr.next;
                }
                n = n.next;
            }
        }
        if(m==null){
            while(n!=null){
                curr.next = new ListNode(n.val);
                n = n.next;
                curr = curr.next;
            }
        }
        if(n==null){
            while(m!=null){
                curr.next = new ListNode(m.val);
                m = m.next;
                curr = curr.next;
            }
        }
        return result;
    }
}