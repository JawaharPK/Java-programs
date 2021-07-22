package com.ROUND2;
import java.util.*;
public class sumOfArray
{
    /*
      Input: mat[M][N] = {{1, 2, 3, 4, 6},
                          {5, 3, 8, 1, 2},
                          {4, 6, 7, 5, 5},
                          {2, 4, 8, 9, 4}
                          };
index = (2, 0) and (3, 4)

Output:
Rectangle
4 6 7 5 5
2 4 8 9 4
sum 54

     */
    public static int sum(int arr[][],int n,int m)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the index:");
        int r=in.nextInt();
        int c=in.nextInt();
        //int r2=in.nextInt();
        //int c2=in.nextInt();
        int sum=0;
        for(int row=r;row<=n;row++)
        {
            for(int col=c;col<=n;col++)
            {
                System.out.print(arr[row][col]);
                sum+=arr[row][col];
            }
            System.out.println();
        }
        return sum;
    }
    public static void main(String args[])
    {
        sumOfArray s=new sumOfArray();
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int arr[][]=new int[n][m];
        for(int row=0;row<n;row++)
        {
            for (int col = 0; col < m; col++)
            {
                arr[row][col] = input.nextInt();
            }
            input.nextLine();
        }
        int res=sum(arr,n,m);
        System.out.println(res);
    }
}
