package com.telegramzoho;
import java.util.*;
public class problem29 {
    /*
Input:
a2b4c6
Output:
aabbbbcccccc

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String res="";
        for(int i=0;i<s.length();i+=2)
        {
            int times=Integer.parseInt(String.valueOf(s.charAt(i+1)));
            for(int j=0;j<times;j++)
            {
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
