package leetcode.editor.cn;

//////给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。 
//////
////// 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。 
//////
////// 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。 
//////
////// 
//////
////// 说明: 
//////
////// 为什么返回数值是整数，但输出的答案是数组呢? 
//////
////// 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。 
//////
////// 你可以想象内部操作如下: 
//////
////// 
//////// nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
//////int len = removeElement(nums, val);
//////
//////// 在函数里修改输入数组对于调用者是可见的。
//////// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
//////for (int i = 0; i < len; i++) {
////// print(nums[i]);
//////}
////// 
//////
////// 
//////
////// 示例 1： 
//////
////// 
//////输入：nums = [3,2,2,3], val = 3
//////输出：2, nums = [2,2]
//////解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而
// 
//////nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
////// 
//////
////// 示例 2： 
//////
////// 
//////输入：nums = [0,1,2,2,3,0,4,2], val = 2
//////输出：5, nums = [0,1,4,0,3]
//////解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新
//长度
////后面
//////的元素。
////// 
//////
////// 
//////
////// 提示： 
//////
////// 
////// 0 <= nums.length <= 100 
////// 0 <= nums[i] <= 50 
////// 0 <= val <= 100 
////// 
////// Related Topics 数组 双指针 👍 1387 👎 0
////
//

public class RemoveElement {
    public static void main(String[] args) {
        Solution solution = new RemoveElement().new Solution();
        int[] nums = {2,1,3,2};
        solution.removeElement(nums, 2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 使用双指针
         * 通过左右指针的移动和覆盖操作将非目标元素移动到数组最左侧
         * 最后返回左指针的移动次数就代表新数组的长度
         *
         *
         * @param nums 原始数组
         * @param val 目标值
         * @return int
         * @author 青灯
         * @date 2022/7/13 09:52
         */
//        public int removeElement1(int[] nums, int val) {
//            // 定义左指针
//            int left = 0;
//            // 定义右指针
//            int right = nums.length - 1;
//            // 当左右指针相遇时 代表全部找出
//            while (left <= right) {
//                // 当左指针元素与目标元素相等时, 将左指针的元素覆盖为此时右指针指向的元素
//                if (nums[left] == val) {
//                    // 覆盖
//                    nums[left] = nums[right];
//                    // 右指针左移
//                    right--;
//                } else {
//                    // 左指针右移
//                    left++;
//                }
//            }
//            // 左指针移动的次数代表新数组长度 left - 1 代表新数组最后一个元素的下标
//            return left;
//        }

        public int removeElement(int[] nums, int val) {
            // 同向双指针 覆盖数组元素解决问题
            // 1. 定义慢指针指向数组0下标, 慢指针移动次数代表新数组的长度
            // 2. 定义快指针初始指向数组0下标
            // 3. 当慢指针指向的值不是目标值时, 慢指针和快指针一起移动
            // 4. 当慢指针指向的值与目标值相同, 快指针移动, 将后面不等于目标值的元素覆盖到慢指针指向位置(覆盖目标值 达到删除效果)
            // 5. 覆盖之后慢指针移动, 慢指针最后移动的
            int slowIndex = 0;
            for (int i = 0; i <= nums.length - 1; i++) {
                if (nums[i] != val) {
                    nums[slowIndex] = nums[i];
                    slowIndex++;
                }
            }
            return slowIndex;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}