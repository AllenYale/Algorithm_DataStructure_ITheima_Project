package com.itheima.algorithm.binarysearch;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.itheima.algorithm.binarysearch.BinarySearch.*;


/**
 * ClassName: TestBinary
 * PackageName: com.itheima.algorithm.binarysearch
 * Description:
 *
 * @Author: Hanyu
 * @Date: 24/01/10 - 07:12
 * @Version: v1.0
 */
public class TestBinarySearch {

    @Test
    @DisplayName("测试 binarySearchBasic")
    public void test(){
        int arr[] = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, binarySearchBasic(8, arr));
    }

    @Test
    public void test2(){
        /*
        在 Java 中，整数使用补码表示。负数的二进制形式是将对应正数的二进制形式按位取反（取反操作），然后再加1。
        因此，-2 的二进制形式如下：
-2 的二进制形式（32 位）：11111111111111111111111111111110
         */
        int i = -2;
        System.out.println(i >>> 2);

        int j = Integer.MAX_VALUE; //2^31-1
        System.out.println("j = " + j);
        System.out.println("j+1 = " + (j + 1));

        int k = -1073741826;
        long l = -1073741826L;
        System.out.println(k >>> 1);
    }
}
