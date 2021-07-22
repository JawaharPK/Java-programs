package com.telegramzoho;
import java.util.*;
public class problem25
{
    /*
    input:
      5
Output:
1 6 10 13 15
2 7 11 14
3 8 12
4 9
5

     */
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            int num = i;
            int n=rows;
            for (int j=(rows-i);j>=0;j--)
            {
                if(n!=0)
                {
                    System.out.print(num+" ");
                    num = num + n;
                }
               n--;
            }
            System.out.println();
        }
    }
}
