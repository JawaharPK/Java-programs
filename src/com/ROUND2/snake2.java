package com.ROUND2;
import java.util.*;
public class snake2 {
    /*
      input:
           10 20 30 40
           50 60 70 80
           27 29 47 48
           32 33 39 50

      output:
           10 20 30 40 80 70 60 50 27 29 47 48 50 39 33 32
     */


    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int arr[][]=new int[4][4];
        for(int row=0;row<4;row++)
        {
            for(int col=0;col<4;col++)
            {
                arr[row][col]= input.nextInt();
            }
            input.nextLine();
        }
        for(int row=0;row<4;row++)
        {
            if(row%2==0)
            {
                for(int col=0;col<4;col++)
                {
                    System.out.print(arr[row][col]+" ");
                }
            }
            else
            {
                for(int col=4-1;col>=0;col--)
                {
                    System.out.print(arr[row][col]+" ");
                }
            }
        }
    }
}
