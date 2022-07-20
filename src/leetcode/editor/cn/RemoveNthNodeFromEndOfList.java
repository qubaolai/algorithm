package leetcode.editor.cn;

//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针 👍 2135 👎 0

import leetcode.editor.cn.common.ListNode;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
        ListNode listNode = new ListNode(1, new ListNode(2));
        solution.removeNthFromEnd(listNode, 2);
    }

//leetcode submit region begin(Prohibit modification and deletion)

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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // 链表长度计算法
            ListNode cur = head;
            int size = 0;
            while (cur != null) {
                size++;
                cur = cur.next;
            }
            if (n < 0 || n > size) {
                return null;
            }
            ListNode mHead = new ListNode(-1, head);
            ListNode tmp = mHead;
            for (int i = 0; i < size - n; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            return mHead.next;
            // 快慢双指针方法
//        ListNode mHead = new ListNode(-1, head);
//        ListNode pre = mHead;
//        ListNode cur = mHead;
//
//        while (n >= 0) {
//            cur = cur.next;
//            n--;
//        }
//
//        while (cur != null) {
//            pre = pre.next;
//            cur = cur.next;
//        }
//        System.out.println(pre.val);
//        pre.next = pre.next.next;
//        return mHead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}