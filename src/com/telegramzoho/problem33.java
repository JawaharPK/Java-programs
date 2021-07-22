package com.telegramzoho;
import java.util.*;
public class problem33 {
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
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        String st="1";
        System.out.println(st);
        for(int i=0;i<n-1;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<st.length();j++)
            {
                int count=1;
                while(j+1<st.length() && st.charAt(j)==st.charAt(j+1))
                {
                    count++;
                    j++;
                }
                sb.append(count).append(st.charAt(j));
            }
            st=sb.toString();
            System.out.println(st);
        }
    }
}
