package com.telegramzoho;
import java.util.*;
public class problem35 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s= input.next();
        int mid=s.length()/2;
        for(int i=0;i<s.length();i++)
        {
            for(int blank=0;blank<(s.length()-i-1);blank++)
            {
                System.out.print(" ");
            }
            for(int j=0,k=mid;j<(i+1);j++,k++)
            {
                if(k==s.length())
                {
                 k=0;
                }
                System.out.print(s.charAt(k));
            }
            System.out.println();
        }
    }
}
