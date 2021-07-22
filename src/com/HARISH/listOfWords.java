package com.HARISH;
import java.util.*;
public class listOfWords {
    /*
       input:
            hello world
       output:
            world
     */
    public static boolean check(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='e')
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n=input.nextInt();
        String s;
        System.out.println("Enter "+n+" words:");
        for(int i=0;i<n;i++)
        {
            s= input.next();
            if(check(s))
            {
                System.out.println(s);
            }
        }
    }
}
