package com.telegramzoho;
import java.util.*;
public class problem26 {
    /*
       input:
             one two three

        output:
             three two one
     */
    public static void reverse(String str[],int cpos)
    {
        if(cpos<str.length)
        {
            reverse(str,cpos+1);
        }
        if(cpos>=1)
        {
            System.out.print(str[cpos-1]+" ");
        }
    }
   public static void main(String args[])
   {
       Scanner input=new Scanner(System.in);
       String str=input.nextLine();
       reverse(str.split(" "),0);
   }
}
