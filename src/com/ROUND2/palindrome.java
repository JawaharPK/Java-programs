package com.ROUND2;
import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;
            while(i<j)
            {
                if(s.charAt(i++)!=s.charAt(j--))
                {
                    return false;
                }
            }
            return true;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s= input.next();
        if(isPalindrome(s))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
