package com.ROUND2;
import java.util.*;
public class CharsCount {
    /*
      Ex I/p abcccccbba
        O/p 8 (from a to a)

        I/p aaaaaaaa
        O/p 6
     */


    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = s.length();
        if (s.charAt(0) == 'a' && s.charAt(n - 1) == 'a') {
            int count = 0;
            for (int i = 1; i < n-1; i++)
            {
                count++;

            }
            System.out.println(count);
        }
    }
}