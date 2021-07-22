package com.NEW;
import java.util.*;
public class recursion1
{
    /*
       input:4
       output:24
     */
    public static long factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);           // 4*3!   4*(3*2!)    4*(3*2*1!)    4*3*2*1
        }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value:");
        int n= input.nextInt();
        System.out.println(factorial(n));
    }
}
