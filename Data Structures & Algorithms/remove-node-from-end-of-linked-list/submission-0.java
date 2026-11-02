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
        if(head == null) return null;
        int x = 0;
        ListNode curr = head;

        while(curr != null){
            x++;
            curr = curr.next;
        }
        
        if(x < n)return null;
        curr = new ListNode(0);
        ListNode c = curr;
        curr.next = head;
        int ind = x - n;
        while(ind > 0 && curr != null){
            curr = curr.next;
            ind--;
        }

        curr.next = curr.next.next;
        
        return c.next;
    }
}
