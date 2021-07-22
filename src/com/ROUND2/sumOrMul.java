package com.ROUND2;
import java.util .*;
public class sumOrMul {
    /*
    Input:
	5
	120 24 71 10 59
	Output:
	3 8 8 1 45
     */

        public static void Matrix(int arr[], int n)
        {
            for(int i=0;i<n;i++)
            {
                int sum=0,mul=1;
                while(arr[i]!=0)
                {
                    sum = sum + arr[i] % 10;
                    mul=mul*(arr[i]%10);
                    arr[i] = arr[i] / 10;
                }
                if(mul>sum)
                {
                    System.out.print(mul+" ");
                }
                else
                {
                    System.out.print(sum+" ");
                }
            }
        }
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            System.out.println("N:");
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = input.nextInt();
            }
            Matrix(arr, n);
        }
}