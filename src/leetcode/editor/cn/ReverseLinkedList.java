package leetcode.editor.cn;

//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
// 
// 
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
// 
// 
// Related Topics 递归 链表 👍 2631 👎 0

public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList().new Solution();

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
        public ListNode reverseList(ListNode head) {
            // 递归调用方式
            // return reverse(null, head);
            // 双指针方式
            // 定义cur指针指向头结点
            ListNode cur = head;
            // 定义pre指针指向null
            ListNode pre = null;
            // 当cur指针指向null, 循环结束
            while (cur != null) {
                // 临时保存cur的下一个节点, 稍后用于节点移动
                ListNode tmp = cur.next;
                // 反转节点
                cur.next = pre;
                // 向后移动pre节点
                pre = cur;
                // 向后移动cur节点, 注意这里不能使用cur = cur.next; 会陷入死循环
                cur = tmp;
            }
            // 遍历结束后 cur节点指向null, pre节点为新链表的头节点
            return pre;
        }
        public ListNode reverse(ListNode pre, ListNode cur) {
            // cur节点指向null时, pre为反转后链表的头节点
            if (cur == null) {
                return pre;
            }
            // 保存当前节点的下一个节点, 作为递归反转时的cur节点
            ListNode tmp = cur.next;
            // 反转当前节点和pre节点
            cur.next = pre;
            // 递归调用, 将cur做前一个节点(pre指针指向), 将tmp(cur指向节点的下一个节点)作为当前节点
            return reverse(cur, tmp);
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}