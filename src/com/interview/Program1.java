package com.interview;
import java.util.*;
public class Program1 {
    public static void reverseString(String s)
    {
        char arr[]=s.toCharArray();
        int start=0,end=arr.length-1;
        while(start<end)
        {
            if(Character.isUpperCase(arr[start]))
            {
                start++;
            }
            else if(Character.isUpperCase(arr[end]))
            {
                end--;
            }
            else
            {
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        reverseString(s);
    }
}
