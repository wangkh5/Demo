package com.wangkaihua.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @desciption: 插入排序
 * @author: wangkaihua
 * @date: 2019/1/6 18:00
 */
public class InsertSort {

    /**
     * 插入排序
     * 从第二个元素开始假如前面的所有元素都是有序的，
     * 从第二个元素依次拿第二个、第三个、第四个...
     * 和后面的元素相比如果大于后面的元素就交换位置
     * 交换后如过此元素还大于前面的元素继续交换
     */
    @Test
    public void insertSort(){
        int [] arr = {5,9,6,5,0,3,2,0,11,2};
        for (int i = 0; i<arr.length-1;i++){
            if (arr[i+1] < arr[i]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                    int temp2 = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
