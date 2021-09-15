package com.dong.sort;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class QuickSort {
    public static void sort(int[] arr,int low,int high){
        if (low < high) {
            int index = getIndex(arr,low,high);
            sort(arr, low, index - 1);
            sort(arr, index + 1, high);
        }

    }

    private static int getIndex(int[] arr, int low, int high) {
        int pivot = arr[low];

        while (low < high) {
            while (low<high&&arr[high]>=pivot) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put(1, 2);
        map.put(1, 1);
        System.out.println(map.get(1));
        int aa = 1;
        String s = String.valueOf(123);

        for (int i = 0; i < s.length(); i++) {
            System.out.println((int)s.charAt(i));
        }
        ArrayList lis = new ArrayList();

        lis.add(1);
        lis.add(2);
        lis.add(3);
        Collections.reverse(lis);
        System.out.println(lis);
        String s1 = lis.toString();
        System.out.println(s1);
        Integer a = Integer.valueOf(aa);
        System.out.println(a);

        System.out.println(map.containsValue(2));
//        int[] a = {8, 2, 5, 0, 7, 4, 6, 1};
//        sort(a, 0, a.length-1);
//        for (int i:a
//             ) {
//            System.out.println(i);
//        }
    }
}
