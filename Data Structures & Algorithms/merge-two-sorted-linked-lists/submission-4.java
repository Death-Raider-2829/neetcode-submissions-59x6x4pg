class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a single dummy node to act as the "Entry Point"
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // While both "data streams" have packets available
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If one "stream" finishes, just link the remaining of the other
        // This is like a "Failover" mechanism
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next;
    }
}