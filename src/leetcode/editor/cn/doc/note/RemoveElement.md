# 图解说明如下

主要思路就是通过左右指针移动将不等于目标值的元素都放在数组左侧, 然后返回左指针的值就是新数组的长度

中间黄框的文档说明代表每次循环的操作

<img src="https://cdn.jsdelivr.net/gh/qubaolai/picture@main/202207131049500.png" alt="image-20220713104944398" style="zoom:33%;" />

# 注意

1. **覆盖一次后左指针不要着急右移, 因为有可能覆盖过来的元素与目标值相同**

2. 注意<font color="orange">**右指针初始位置**</font> 和 <font color="orange">**退出循环的条件**</font>是相关的