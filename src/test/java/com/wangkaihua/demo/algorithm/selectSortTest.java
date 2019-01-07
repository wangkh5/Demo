package com.wangkaihua.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @desciption: 选择排序
 * @author: wangkaihua
 * @date: 2019/1/7 11:24
 */
public class selectSortTest {

    @Test
    public void testSelectSort(){
        int [] arr = {2, 4, 5, 9, 0, 2, 1, 3, 0, -1};
        System.out.println(Arrays.toString(arr));
        // length-1 因为最后一个元素不需要再比较
        for (int i = 0; i < arr.length-1; i++) {
            // 默认每轮的第一个元素为最小的元素
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 如果后面的元素比最小的元素大记录最小的元素的位置，再继续拿新的最小的元素向后比较
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // 如果已经是有序的那么 minIndex = i 则不需要交换位置
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
