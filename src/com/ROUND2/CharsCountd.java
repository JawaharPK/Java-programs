package com.ROUND2;
import java.util.Scanner;
public class CharsCountd  {
    public static void main(String args[]) {
     /*
      input:
        str=aaaabbbccc

      output:
           a4b3c3
      */
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String s = " ";
        for (int i = 0; i < str.length(); i++)
        {
            s += str.charAt(i);
            int count=1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1))
            {
                count++;
                i++;
            }
            s += count;
        }
        System.out.print(s);
    }
    }
