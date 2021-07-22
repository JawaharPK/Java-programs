package com.ROUND2;
import java.util.*;
public class numberPattern3 {
    /*
     input:
     5

     output:
               A
              B B
             C C C
            D D D D
           E E E E E
     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Row:");
        int n= input.nextInt();
        char count='A';
        for(int i=0;i<n;i++)
        {
            for(int blank=0;blank<(n-i-1);blank++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(i+1);j++)
            {
                System.out.print(count +" ");
            }
            count++;
            System.out.println();
        }
    }
}
