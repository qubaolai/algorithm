思路如下:

设「第一个公共节点」为 node ，「链表 headA」的节点数量为 a ，「链表 headB」的节点数量为 b ，「两链表的公共尾部」的节点数量为 c ，则有：

​​		头节点 headA 到 node 前，共有 a - ca−c 个节点；

​​		头节点 headB 到 node 前，共有 b - cb−c 个节点；

考虑构建两个节点指针 A , B 分别指向两链表头节点 headA , headB ，做如下操作：

- 指针 A 先遍历完链表 headA ，再开始遍历链表 headB ，当走到 node 时，共走步数为：

<div style="text-align:center;">a + (b - c)</div>

- 指针 B 先遍历完链表 headB ，再开始遍历链表 headA ，当走到 node 时，共走步数为：

<div style="text-align:center">b + (a - c)</div>

如下式所示，此时指针 A , B 重合，并有两种情况：

<div style="text-align:center">a + (b - c) = b + (a - c)</div>

1. 若两链表 有 公共尾部 (即 c > 0 ) ：指针 A , B 同时指向「第一个公共节点」node 。

2. 若两链表 无 公共尾部 (即 c = 0 ) ：指针 A , B 同时指向 null 。

因此返回 A 即可。

流程如下图:


<img src="https://cdn.jsdelivr.net/gh/qubaolai/picture@main/202207211723226.gif" alt="Kapture 2022-07-21 at 17.22.31" style="zoom:50%;" />