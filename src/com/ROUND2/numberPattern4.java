package com.ROUND2;
import java.util.*;
public class numberPattern4 {
    /*
      input:
            3
      output:
              1
            2 3 2
          4 5 6 5 4

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int n= input.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int blank=0;blank<(n-i-1);blank++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)+1;j++)
            {
              if(j<=i)
              {
                  System.out.print(++count);
              }
              else
              {
                  System.out.print(--count);
              }
            }
            count+=i;
            System.out.println();
        }
    }
}
