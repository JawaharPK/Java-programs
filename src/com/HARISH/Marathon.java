package com.HARISH;
import java.util.*;
public class Marathon {

    public static void main(String args[])
    {
     Scanner input=new Scanner(System.in);
     int tt= input.nextInt();
     int ntpd= input.nextInt();
     int days= input.nextInt();
     if(tt>=0)
     {
         int noofp=7;
         int res;
         res=7*days;
         if(res>=50)
         {
             System.out.println("1");
         }
         else
         {
             System.out.println("0");
         }
     }
     else
     {
         System.out.println("INVALID OUTPUT");
     }
    }
}
