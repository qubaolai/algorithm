package leetcode.editor.cn.common;

import leetcode.editor.cn.SwapNodesInPairs;

/**
 * @project: algorithm
 * @package: leetcode.editor.cn.common
 * @className: ListNode
 * @description:
 * @author: 青灯
 * @date: 2022/7/19 16:47
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
