package com.HARISH;
import java.util.*;
public class squarepattern {
    /*
    inp:5
     1
    21
   321
  4321
 54321

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n>=1)
        {
            for(int i=0;i<n;i++)
            {
                for(int blank=0;blank<(n-i);blank++)
                {
                    System.out.print(" ");
                }
                for(int j=i+1;j>0;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
