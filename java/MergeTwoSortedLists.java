// Solution for https://leetcode.com/problems/merge-two-sorted-lists/submissions/
package java;

public class MergeTwoSortedLists {
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        if(list1==null && list2==null)
            return null;
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        if(list1.val<list2.val) {
          head=new ListNode(list1.val);
            list1=list1.next;
        }else {
          head=new ListNode(list2.val);
            list2=list2.next;
        }
        
        ListNode head1=head;
        while(list1!=null && list2!=null)
        {
            if(list1.val>=list2.val)
            {
                head.next=list2;
                list2=list2.next;
            }else{
                head.next=list1;
                list1=list1.next;
            }
            head=head.next;
           
        }
        while(list1!=null) {
           
            head.next=list1;
            head=head.next;
            list1=list1.next;
        }
        while(list2!=null) {
         
            head.next=list2;
            head=head.next;
            list2=list2.next;
        }
        return head1;
        
        
    }
}
}
