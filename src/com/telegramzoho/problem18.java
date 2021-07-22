package com.telegramzoho;
import java.util.*;
public class problem18 {
    /*
Sample Input 1
experience
enc

Sample Output 1
xpri

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("String1:");
        String s1= input.next();
        System.out.println("String2:");
        String s2= input.next();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        for(int i=0;i< arr2.length;i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    arr1[j] = '#';
                }
            }
        }
        String res="";
        for(int i=0;i< arr1.length;i++)
        {
            if(arr1[i]!='#')
            {
                res+=arr1[i];
            }
        }
        System.out.println(res);
    }
}
