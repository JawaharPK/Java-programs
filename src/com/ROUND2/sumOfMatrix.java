package com.ROUND2;
import java.util.*;
public class sumOfMatrix {

    /*
      I/P:
            3 3
            1 2 3
            4 5 6
            7 8 9

      O/P: 34
     */


    public static void matrix(int a[][],int n,int m)
    {
        int i,j;
        int upsum=0;
        int lowsum=0;
        for( i=0;i<n;i++)
        {
            for (j = 0;  j< n; j++)
            {
                if (i<=j)
                {
                    upsum += a[i][j];
                }
            }
        }
        for(i=0;i<n;i++)
        {
                for( j=0;j<n;j++)
                {
                    if(j<=i)
                    {
                        lowsum+=a[i][j];
                    }
                }
        }
        if(upsum>lowsum)
        {
            System.out.println("Uppertriangle is greater="+upsum);
        }
        else
        {
            System.out.println("Lowertriangle is greater="+lowsum);
        }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();
        int a[][]=new int[n][n];
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                a[row][col]=input.nextInt();
            }
            input.nextLine();
        }
        matrix(a,n,m);
    }
}
