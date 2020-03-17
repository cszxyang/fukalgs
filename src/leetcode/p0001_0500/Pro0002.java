package leetcode.p0001_0500;

import base.ListNode;

public class Pro0002 {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return addLists(l1, l2, 0);
        }

        private ListNode addLists(ListNode la, ListNode lb, int carry) {
            if (la == null && lb == null && carry == 0) {
                return null;
            }

            int val = carry;
            if (la != null) {
                val += la.val;
            }
            if (lb != null) {
                val += lb.val;
            }

            ListNode res = new ListNode(val % 10);
            res.next = addLists(la == null ? null : la.next,
                    lb == null ? null : lb.next,
                    val >= 10 ? 1 : 0);
            return res;
        }
    }
}

