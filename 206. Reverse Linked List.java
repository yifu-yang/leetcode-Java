/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode newhead = null;
        ListNode curr = head;
        while(curr!=null){
            if(newhead==null){
                newhead=new ListNode(curr.val);
                newhead.next=null;
            }else{
                ListNode tmp = newhead;
                newhead = new ListNode(curr.val);
                newhead.next = tmp;
            }
            
            curr=curr.next;
        }
        return newhead;
    }
}