package com.ROUND2;
import java.util.*;
public class pattern2 {
    /*
      input:
      5
      output:
* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int row= input.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int blank=0;blank<i;blank++)
            {
                System.out.print(" ");
            }
            for(int j = row - i; j > 0; j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int j=row;j>0;j--)
        {
            for(int blank=(j-1);blank>0;blank--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<(row-j+1);k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
