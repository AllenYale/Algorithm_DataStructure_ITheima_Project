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
}
