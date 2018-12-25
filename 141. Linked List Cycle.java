/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;
        if(head == null){
            return false;
        }
        while(true){
            oneStep = oneStep.next;
            if(oneStep==null){
                return false;
            }
            if(twoStep==null||twoStep.next==null){
                return false;
            }
            twoStep = twoStep.next.next;
            if(oneStep==null||twoStep==null){
                return false;
            }
            if(oneStep.val==twoStep.val){
                return true;
            }
        }
    }
}