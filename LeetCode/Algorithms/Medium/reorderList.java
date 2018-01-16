/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/
public class Solution {
    public void reorderList(ListNode head) {
        if(head != null && head.next != null){
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode second = slow.next;
			slow.next = null;

            second = reverseOrder(second);

            ListNode p1 = head;
            ListNode p2 = second;

            while(p2 != null){
                ListNode temp1 = p1.next;
                ListNode temp2 = p2.next;

                p1.next = p2;
                p2.next = temp1;

                p1 = temp1;
                p2 = temp2;
            }
        }

    }

    public ListNode reverseOrder(ListNode head){
        ListNode pre = head;
        ListNode curr = head.next;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        head.next = null;
        return pre;
    }
}
