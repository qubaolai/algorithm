<img src="https://cdn.jsdelivr.net/gh/qubaolai/picture@main/202207191547030.png" alt="image-20220719154724473" style="zoom:33%;" />

# 双指针法

1. 定义一个指针pre指向null, 定义一个指针cur指向头节点
2. 使cur和pre进行反转, 以完成一次局部反转
3. 后移cur和pre
4. 重复3和4步骤, 直到cur指向null

# 递归实现

1. 当cur指向null时, pre节点为反转后的链表头节点
2. 使用tmp保存cur的下一个节点, 作为递归调用的cur节点
3. 反转cur和pre
4. 递归调用, cur作为前指针(pre), tmp作为递归中的cur节点