package com.DataStructures;
import java.util.*;
public class Palindrome {
    public static Boolean isPalindrome(String name)
    {
        int i=0,j=name.length();
        while(i<j)
        {
            if(name.charAt(i++)!=name.charAt(--j))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String aargs[])
    {
        Scanner input=new Scanner(System.in);
        String name=input.next();
        if(isPalindrome(name))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
