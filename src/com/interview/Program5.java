package com.interview;
import java.util.*;
public class Program5 {
    public static int countSetBits(int n)
    {
        int count=0;
        while(n>0)
        {                        // 2
            count+=n&1;           //1 0
            n>>=1;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(countSetBits(n));
    }
}
