package com.ROUND2;
import java.util.*;
/*
    input:
    5

    Output:
    start with 1 (sefault)
    1
    11
    21
    1211
    111221
 */

public class CountNumberPattern {
    public void countnum(int n)
    {
        Scanner input=new Scanner(System.in);
        String st="1";
        System.out.println(st);
        for(int row=0;row<n-1;row++)
        {
            StringBuilder sb=new StringBuilder();
            for(int col=0;col<st.length();col++)
            {
                int count=1;
                while(col+1<st.length()&&st.charAt(col)==st.charAt(col+1))
                {
                    count++;
                    col++;
                }
                sb.append(count).append(st.charAt(col));
            }
            st=sb.toString();
            System.out.println(st);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CountNumberPattern c=new CountNumberPattern();
        c.countnum(n);
    }
}
