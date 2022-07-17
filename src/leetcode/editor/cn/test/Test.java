package leetcode.editor.cn.test;

/**
 * @project: algorithm
 * @package: leetcode.editor.cn.test
 * @className: Test
 * @description:
 * @author: 青灯
 * @date: 2022/7/14 17:38
 **/
public class Test {
    public static void main(String[] args) {
        int n = 10;
        int coun = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >> 1 == 0) {
                    continue;
                }
                coun = i + j;
            }

        }
        System.out.println(coun);
    }
}
