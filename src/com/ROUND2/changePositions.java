package com.ROUND2;
import java.util.*;
public class changePositions {
    /*
       input:
            hi i am jawa
       output:
            aw a jm aiih
     */

    public static void preserveSpace(String str)
    {
        int n = str.length();
        int start = 0;
        int end = n - 1;
        char[] arr = str.toCharArray();
        while (start < end)
        {
            if (arr[start] == ' ')
            {
                start++;
                continue;
            }
            else if (arr[end] == ' ')
            {
                end--;
                continue;
            }
            else
            {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(String.valueOf(arr));
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        preserveSpace(str);
    }
}
