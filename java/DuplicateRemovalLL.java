//Solution for problem https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package java;

public class DuplicateRemovalLL {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null)
                return null;
            ListNode t1 = head;
            ListNode t2 = head;
            t1 = t1.next;
            while (t1 != null) {
                if (t1.val != t2.val) {
                    t2.next = t1;
                    t2 = t2.next;
                } else if (t2.val == t1.val && t1.next == null) {
                    t2.next = null;
                }
                t1 = t1.next;

            }
            return head;

        }

        // Better Solution

        class Solution {
            public ListNode deleteDuplicates(ListNode head) {
                if (head == null)
                    return null;
                ListNode t1 = head;

                while (t1 != null && t1.next != null) {
                    if (t1.val == t1.next.val) {
                        t1.next = t1.next.next;

                    } else
                        t1 = t1.next;

                }
                return head;

            }
        }
    }

}
