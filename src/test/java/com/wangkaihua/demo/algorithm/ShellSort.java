package com.wangkaihua.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @desciption: 希尔排序，建立在插入排序之上
 *  ，解决插入排序的弊端
 * @author: wangkaihua
 * @date: 2019/1/8 11:49
 */
public class ShellSort {

    @Test
    public void shellSort() {
        int [] arr = {1, 0, 9, 0, 3, 5, 3, 2, 6, 7};

        // 每次排序按照间隙分组知道间隙等于1为止
        for (int gap = arr.length/2; gap >= 1; gap /= 2) {
            for (int i = gap; i<arr.length; i++) {
                for(int j = i; j - gap >= 0; j-=gap) {
                    if(arr[j-gap] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr [j-gap];
                        arr[j-gap] = temp;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
