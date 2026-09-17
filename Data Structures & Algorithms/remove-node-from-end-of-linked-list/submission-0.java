/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = reverseList(head);

        ListNode result = curr;

    if(n==1){
        return reverseList(curr.next);
    }

        while(n>2){
            curr = curr.next;
            n -= 1;
        }

        //second to the one to remove

        curr.next = curr.next.next;

        return reverseList(result);

    }

    public ListNode reverseList(ListNode head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode node = reverseList(head.next);

        head.next.next = head;
        head.next = null; 
        return node;
    }
}
