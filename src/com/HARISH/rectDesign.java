package com.HARISH;
import java.util.*;
public class rectDesign {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Height:");
        int h= input.nextInt();
        System.out.println("Width:");
        int w= input.nextInt();
        int arr[][]=new int[h][w];
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(j==1 || j==w)
                {
                    System.out.print("X"+" ");
                }
                else
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}
