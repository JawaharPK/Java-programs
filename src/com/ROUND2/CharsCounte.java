package com.ROUND2;
import java.util.Scanner;
public class CharsCounte
{
            /*
           input:
           str=a4b3c3
           output:
           aaaabbbccc

         */
    public void expand(String s)
    {
        int len=s.length();
        String ans=" ";
        for(int i=0;i<len;i+=2)
        {
            char f=s.charAt(i);
            int times=Integer.parseInt(String.valueOf(s.charAt(i+1)));
            for(int j=0;j<times;j++)
            {
                ans+=f;
            }
        }
        System.out.print(ans);
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        CharsCounte p=new CharsCounte();
        p.expand(str);
    }
}
