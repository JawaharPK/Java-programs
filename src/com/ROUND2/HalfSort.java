package com.ROUND2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class HalfSort{
    /*
       input:
          3 1 2 4 5 9 13 14 12

        output:
          2 3 5 12 13 14 9 4 1
     */
    public static void sort(int[] arr, int n) {
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Object arr2[] = even.toArray();
        Object arr1[] = odd.toArray();
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < arr2.length; j++) {
            sb.append(arr2[j] + " ");
        }
        for (int k = arr1.length - 1; k >= 0; k--) {
            sb.append(arr1[k] + " ");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        //code
        Scanner s = new Scanner(System.in);

            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            sort(arr, n);
        }
    }


