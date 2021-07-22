package com.telegramzoho;
import java.util.*;
public class problem15 {
    /*
        input:
             2 15
        output:
             3 5 7 9 11 13
     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        for(int i=num1;i<num2;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
