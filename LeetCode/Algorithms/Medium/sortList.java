/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        // get the middle node in the list
        ListNode middle = getMiddle(head);
        ListNode nextToMiddle = middle.next;

        // set next of middle to null
        middle.next = null;

        // sort the left list
        ListNode left = sortList(head);

        // sort the right list
        ListNode right = sortList(nextToMiddle);

        ListNode sorted = merge(left, right);
        return sorted;
    }

    private ListNode merge(ListNode left, ListNode right){
        ListNode res = null;
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }

        if(left.val <= right.val){
            res = left;
            res.next = merge(left.next, right);
        }else{
            res = right;
            res.next = merge(left, right.next);
        }
        return res;
    }

    private ListNode getMiddle(ListNode head){
        if(head == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
