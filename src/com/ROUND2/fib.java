package com.ROUND2;
import java.util.*;
public class fib {
    /*
      input:
           8
      output:
           1 1 2 3 4 9 8 27
     */

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int a=1,b=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                if(i==0)
                {
                    System.out.print(a+" ");
                }
                else
                {
                    a=a*2;
                    System.out.print(a+" ");
                }
            }
            else
            {
                if(i==1)
                {
                    System.out.print(b+" ");
                }
                else
                {
                    b=b*3;
                    System.out.print(b+" ");
                }
            }
        }
    }
}
