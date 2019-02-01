/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val==val){
                if(prev == null){
                    head= curr.next;
                }
                else{
                    prev.next = curr.next;
                }
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}