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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right) return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode current=dummy;

        for(int i=0;i<left-1;i++){
            current=current.next;
        }

        ListNode prev=current;
        ListNode start=prev;
        ListNode end=prev.next;
        current=current.next;
        ListNode next=null;

        while(current!=null && left<=right){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            left++;
        }
        start.next=prev;
        end.next=current;

        return dummy.next;
    }
}