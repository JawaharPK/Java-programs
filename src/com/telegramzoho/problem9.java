package com.telegramzoho;
import java.util.*;
public class problem9 {
    /*
       input:
             abcdefgh
             abdfhjfb
       output:
              c,d d,f e,h f,j g,f h,b


     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s1= input.next();
        String s2= input.next();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        if(arr1.length== arr2.length)
        {
            for(int i=0;i< arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    System.out.println(arr1[i]+","+arr2[i]+" ");
                }
            }
        }
        else
        {
            System.out.println("Mismatch string length");
        }
    }
}
