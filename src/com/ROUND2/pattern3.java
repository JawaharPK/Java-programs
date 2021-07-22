package com.ROUND2;
import java.util.*;
public class pattern3 {
    /*
     input:
     5
     output:
             *
            * *
           *   *
          *     *
         *       *
          *     *
           *   *
            * *
             *
    */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int blank=(n-i-1);blank>0;blank--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)+1;j++)
            {
                if(j==0 || j==(i*2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int j=n;j>1;j--)
        {
            for(int blank=0;blank<(n-j+1);blank++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<2*(j-1);k++)
            {
                if( k==1 || k==(2*(j-1))-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
