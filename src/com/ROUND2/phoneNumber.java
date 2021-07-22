package com.ROUND2;
import java.util.*;
public class phoneNumber {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[14];
        for(int i=0;i<14;i++)
        {
            arr[i]= input.nextInt();
        }
        for(int i=0;i<14;i++)
        {
            if(arr[0]==1 && arr[3]==0 )
            {
                System.out.print(arr[i]);
            }
        }
    }
}
