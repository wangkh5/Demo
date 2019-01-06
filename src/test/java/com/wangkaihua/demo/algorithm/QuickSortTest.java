package com.wangkaihua.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @desciption: 快速排序
 * @author: wangkaihua
 * @date: 2019/1/6 13:09
 */
public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int [] arr = {3,2,4,5,6,7,0,12,3,12,0,0};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * @param arr 要排序的数组
     * @param start 开始排序的索引
     * @param end 结束排序的索引
     */
    private void quickSort(int [] arr, int start, int end) {
        // 开始的位置大于或者等于结束的位置
        if (start >= end) {
            return;
        }
        int low = start;
        int high = end;
        // 默认选取第一个数作为比较的基数
        final int base = arr[start];
        while (low < high) {
            while (low < high && arr[high] >= base) {
                high--;
            }
            // 高位的值小于基数
            arr[low] = arr[high];

            while(low < high && arr[low] <= base) {
                low++;
            }
            // 低位的值大于基数
            arr[high] = arr[low];
        }
        // 把基数的值赋给低位或者高位（低位高位已经重合）
        arr[low] = base;
        // 处理所有比基础数小的数
        quickSort(arr, start, low-1);
        // 处理所有比基础数大的数
        quickSort(arr, low+1, end);
    }

}
