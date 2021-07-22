package com.telegramzoho;
import java.util.*;
public class zigzag {
    public static int[] printZMatrix(int[][] matrix) {
        if(matrix==null && matrix.length==0)
        {
            return null;
        }
        int m= matrix.length;
        int n=matrix[0].length;
        int t=0;
        int []res=new int[n*m];
        for(int i=0;i<n+m-1;i++)
        {
            if(i%2==1)
            {
                //down left
                int x=i<n?0:i-n+1;
                int y=i<n?i:n-1;
                while(x<m && y>=0)
                {
                    res[t++]=matrix[x++][y--];
                }
            }
            else
            {
                //up right
                int x=i<m?i:m-1;
                int y=i<m?0:i-m+1;
                while(x>=0 && y<n)
                {
                    res[t++]=matrix[x--][y++];
                }
            }
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[][] = new int[n][n];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= input.nextInt();
            }
        }
        int res[]=printZMatrix(arr);
        for(int i=0;i< res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
