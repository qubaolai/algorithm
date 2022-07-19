package leetcode.editor.cn;

//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
// 
//
// 示例 2： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 100] 内 
// 0 <= Node.val <= 100 
// 
// Related Topics 递归 链表 👍 1472 👎 0

import leetcode.editor.cn.common.ListNode;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode3.next = new ListNode(4);
        listNode2.next = listNode3;
        listNode1.next = listNode2;

        solution.swapPairs(listNode1);
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
        public ListNode swapPairs(ListNode head) {
            ListNode mHead = new ListNode(-1, head);
            ListNode cur = mHead;
            // 奇数节点cur移动两个以后 cur.next == null, 无法进入循环
            while (cur.next != null && cur.next.next != null){
                ListNode tmp1 = cur.next;
                ListNode tmp2 = cur.next.next.next;

                cur.next = tmp1.next;
                tmp1.next.next = tmp1;
                tmp1.next = tmp2;

                cur = cur.next.next;
            }
            return mHead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}