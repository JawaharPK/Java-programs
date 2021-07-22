package com.telegramzoho;
import java.util.*;
public class problem11 {
    public static void main(String args[])
    {
     Scanner input=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year= input.nextInt();
        if((year%4==0 && year%100!=0)||year%400==0)
        {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
