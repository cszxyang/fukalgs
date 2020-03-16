package leetcode.p0001_0500;

import base.ListNode;

import java.util.HashSet;

/**
 * see 0083. 0001-0500/删除排序链表中的重复元素.md
 *
 * @author cszxyang
 * @since 2020-03-04
 */
public class Pro0083 {
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            HashSet<Integer> set = new HashSet<>();
            ListNode prev = null, temp = head;
            while (temp != null) {
                if (set.contains(temp.val)) {
                    prev.next = temp.next;
                } else {
                    set.add(temp.val);
                    prev = temp;
                }
                temp = temp.next;
            }
            return head;
        }
    }

    static class Solution2 {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            while (current != null && current.next != null) {
                if (current.next.val == current.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    }

    static class Solution3 {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode current = head;
            while (current != null) {
                ListNode runner = current;
                while (runner.next != null) {
                    if (runner.next.val == current.val) {
                        runner.next = runner.next.next;
                    } else {
                        runner = runner.next;
                    }
                }
                current = current.next;
            }
            return head;
        }
    }
}
