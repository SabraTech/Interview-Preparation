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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lenA = length(headA), lenB = length(headB);
        ListNode a = headA;
        ListNode b = headB;

        while(lenA > lenB){
            a = a.next;
            lenA--;
        }

        while(lenB > lenA){
            b = b.next;
            lenB--;
        }

        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
    }

    private int length(ListNode node){
        int length = 0;
        while(node != null){
            node = node.next;
            length++;
        }
        return length;
    }
}
