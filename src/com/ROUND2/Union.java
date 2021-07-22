package com.ROUND2;
import java.util.*;
public class Union {
    /*
      input:
            7 1 5 2 3 6
            3 8 6 20 7

      output:
            union:
                1 2 3 5 6 7 8 20

            inter section:
                 3 6 7
     */
    static void printUnion(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
        {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++)
        {
            hs.add(arr2[i]);
        }
        Object[] res =hs.toArray();
        Arrays.sort(res);
        for(int i=0;i< res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    static void printIntersection(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
        {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++)
        {
            if (hs.contains(arr2[i]))
            {
                System.out.print(arr2[i] + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };
        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);
        System.out.println("Intersection of two arrays is : ");
        printIntersection(arr1, arr2);
    }
}