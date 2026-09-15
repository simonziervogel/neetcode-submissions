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
    HashSet<ListNode> hs = new HashSet<ListNode>();
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        if(hs.contains(head)){
            return true;
        }
        hs.add(head);

        return hasCycle(head.next);

    }
}
