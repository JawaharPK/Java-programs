package com.ROUND2;
import java.util.*;
public class pattern1 {
    /*
       input:
          n=4
       output:
          4444
          4334
          4334
          4444
     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(i==0 || i==n-1 || j==0 || j==n-1)
               {
                   System.out.print(n);
               }
               else
               {
                   System.out.print(n-1);
               }

            }
            System.out.println();
        }
    }
}
