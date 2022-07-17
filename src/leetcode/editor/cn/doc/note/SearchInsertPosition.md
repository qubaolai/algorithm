# [二分查找视频解析](https://www.bilibili.com/video/BV1fA4y1o715)
# 思路如下

1. 由于是`排序数组`所以数组为有序, 并且要求使用`O(log n)`的方式, 所以选择<font color="orange">**二分查找**</font>方式解决问题

2. 先设置左下标和右下标, 然后计算中mid下标值

3. 每次根据 nums[mid] 和 target 之间的大小进行判断，相等则直接返回下标，nums[mid] < target 则 left 右移，nums[mid] > target 则 right 左移

4. 查找结束如果没有相等值则返回 left，该值为插入位置



# 图解如下

目标数字存在于数组中

![image-20220714154942890](https://cdn.jsdelivr.net/gh/qubaolai/picture@main/202207141549052.png)

目标数字不存在于数组中, 且 <font color="orange">**`nums[0] <= target <= nums[nums.length - 1]`**</font>, 这是一个左闭右闭的区间, 注意while循环的退出条件为`<=`

![](https://cdn.jsdelivr.net/gh/qubaolai/picture@main/202207141606704.png)

# 注意

1. 使用二分查找时边界的处理需要注意

2. 两个二分查找的模板

   ```java
   class Solution {
       public int searchInsert(int[] nums, int target) {
           int left = 0, right = nums.length - 1; // 注意
           while(left <= right) { // 注意
               int mid = (left + right) / 2; // 注意
               if(nums[mid] == target) { // 注意
                   // 相关逻辑
               } else if(nums[mid] < target) {
                   left = mid + 1; // 注意
               } else {
                   right = mid - 1; // 注意
               }
           }
           // 相关返回值
           return 0;
       }
   }
   ```

   ```java
   class Solution {
       public int searchInsert(int[] nums, int target) {
           int left = 0, right = nums.length; // 注意
           while(left < right) { // 注意
               int mid = (left + right) / 2; // 注意
               if(nums[mid] == target) {
                   // 相关逻辑
               } else if(nums[mid] < target) {
                   left = mid + 1; // 注意
               } else {
                   right = mid; // 注意
               }
           }
           // 相关返回值
           return 0;
       }
   }
   ```

   