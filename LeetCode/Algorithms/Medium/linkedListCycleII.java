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
    public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            ListNode res = head;
            while(res != slow){
                slow = slow.next;
                res = res.next;
            }
            return res;
        }
    }
    return null;
    }
}
