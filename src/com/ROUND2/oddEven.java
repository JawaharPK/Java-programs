package com.ROUND2;
import java.util.*;
public class oddEven {

    /*
      Input  :  1234567

    Output  :  ODD 4
              EVEN 3
     */


    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n= input.nextInt();
        int arr[]=new int[n];
        int even=0,odd=0;
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++)
        {
           arr[i]= input.nextInt();
           if(arr[i]%2==0)
           {
               even++;
           }
           else
               {
                odd++;
           }
           if(i==n-1)
           {
               System.out.println("ODD:"+odd);
               System.out.println("EVEN:"+even);
           }
        }
    }

}
