package com.telegramzoho;
import java.util.*;
public class problem7 {
    public static int[][] Zig_Zag(final int size)
    {
        int[][] data = new int[size][size];
        int i = 1;
        int j = 1;
        for (int element = 0; element < size * size; element++)
        {
            data[i - 1][j - 1] = element;
            if ((i + j) % 2 == 0)
            {
                // Even stripes
                if (j < size)
                    j++;
                else
                    i+= 2;
                if (i > 1)
                    i--;
            }
            else
            {
                // Odd stripes
                if (i < size)
                    i++;
                else
                    j+= 2;
                if (j > 1)
                    j--;
            }
        }
        return data;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        final int size= input.nextInt();
        int res[][]=Zig_Zag(size);
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
