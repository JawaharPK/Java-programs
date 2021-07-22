package com.telegramzoho;
import java.util.*;
public class problem22 {
    /*
Input:
32

Output:
55


     */
    static long reverse(long num)
    {
     long revnum=0;
     while(num!=0)
     {
         revnum=revnum*10+(num%10);
         num/=10;
     }
     return revnum;
    }
    public static void main(String args[])
    {
     Scanner input=new Scanner(System.in);
     long num,sum;
     num= input.nextInt();
     while(1!=0)
     {
         sum=num+reverse(num);
         if(sum==reverse(sum))
         {
             break;
         }
     }
        System.out.println(sum);
    }
}
