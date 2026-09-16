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
    public void reorderList(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;


        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next; //Middlepoint = slow = first point of backhalf
        }
        
        ListNode second = slow.next; 
        slow.next = null;
        second = reverseList(second);
        ListNode first = head;


        while(second != null){
            ListNode nextFirst = first.next;
            ListNode nextSecond = second.next;

            first.next = second;
            second.next = nextFirst;

            first = nextFirst;
            second = nextSecond;
        }

        

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
        head.next=null;


        return node;
    }
}
