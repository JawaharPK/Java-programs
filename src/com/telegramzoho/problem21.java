package com.telegramzoho;
import java.util.*;
public class problem21 {
    public static void reverseIndex(String s)
    {
        int start=0,end=s.length()-1;
        char arr[]=s.toCharArray();
        while(start<end)
        {
            if(arr[start]==' ')
            {
                start++;
                continue;
            }
            else if(arr[end]==' ')
            {
                end--;
                continue;
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
        System.out.println(String.valueOf(arr));
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        reverseIndex(s);
    }
}
