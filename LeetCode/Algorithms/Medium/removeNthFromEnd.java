/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
	        return null;
	    }
	    ListNode p = head;
	    int cnt = 0;
	    while(p != null){
	        cnt++;
	        p = p.next;
	    }
	    if(n > cnt){
	        return head.next;
	    }
	    int start = cnt - n + 1;
	    if(start == 1){
	        return head.next;
	    }
	    p = head;
	    ListNode ans = p;
	    int i = 0;
	    while(p != null){
	        i++;
	        if( i == start - 1){
	            p.next = p.next.next;
	        }
	        p = p.next;
	    }
	    return ans;
    }
}
