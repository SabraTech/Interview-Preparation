/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = head;

        while(prev != null && prev.next != null){
            if(prev.val == prev.next.val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }

        return head;

    }
}
