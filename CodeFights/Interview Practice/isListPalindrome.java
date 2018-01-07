// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean isListPalindrome(ListNode<Integer> l) {
    ListNode<Integer> fast = l;
    ListNode<Integer> slow = l;

    while(fast != null && fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    ListNode<Integer> reversedList = null;
    if(fast != null){
        reversedList = slow.next;
        slow.next = null;
    }
    slow = l;
    reversedList = reverseList(reversedList);
    while(slow != null && reversedList != null){
        if(!slow.value.equals(reversedList.value)){
            return false;
        }
        slow = slow.next;
        reversedList = reversedList.next;
    }
    return true;
}


ListNode<Integer> reverseList(ListNode<Integer> head){
    ListNode cur = head;
    ListNode prev = null;
    ListNode next = null;
    while(cur != null){
        next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }

    return prev;
}
