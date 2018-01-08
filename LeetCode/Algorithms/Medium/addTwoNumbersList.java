/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3 = newHead;


        while(p1 != null || p2 != null){
            int x=0,y=0;
            if(p1 != null){
                x = p1.val;
                p1 = p1.next;
            }

            if(p2 != null){
                y = p2.val;
                p2 = p2.next;
            }
            int sum = carry + x + y;
            p3.next = new ListNode(sum%10);
            p3 = p3.next;
            carry = sum / 10;
        }
        if(carry > 0){
            p3.next = new ListNode(carry);
        }
        return newHead.next;

    }
}
