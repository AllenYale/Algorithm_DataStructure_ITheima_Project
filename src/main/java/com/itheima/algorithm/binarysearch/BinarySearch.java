package com.itheima.algorithm.binarysearch;

/**
 * ClassName: BinarySearch
 * PackageName: com.itheima.algorithm.binarysearch
 * Description:
 *
 * @Author: Hanyu
 * @Date: 24/01/10 - 07:02
 * @Version: v1.0
 */
public class BinarySearch {
    /**
     * 二分查找基础版：
     *
     * @param target 目标值
     * @param arr    待查找的升序数组
     * @return 找到返回索引，未找到返回-1；
     */
    public static int binarySearchBasic(int target, int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                i = m + 1;
            }else/* if (arr[m] > target) */{
                j = m - 1;
            }
        }
        return -1;
    }
}
