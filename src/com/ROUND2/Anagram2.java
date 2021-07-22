package com.ROUND2;
import java.util.*;
public class Anagram2 {

    /*
     I/p
      catch, got, tiger, mat, eat, Pat, tap, tea
Word: ate

O/p eat, tea
     */

    public static void main(String args[])
    {
     Scanner input=new Scanner(System.in);
     String str[]={"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
     System.out.print("Word:");
     String word=input.next();
     char brr[]=word.toCharArray();
     Arrays.sort(brr);
     int k=0;
     for(int i=0;i< str.length;i++)
     {
         int j=0;
         int count=1;
        char arr[]=str[i].toCharArray();
        Arrays.sort(arr);
        while(arr[j]==brr[j] && j<arr.length-1 && j<brr.length-1 && arr.length== brr.length)
        {
            j++;
            count++;
        }
        if(count==word.length())
        {
            System.out.print(str[i]+" ");
        }
     }
    }
}
