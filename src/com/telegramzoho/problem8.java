package com.telegramzoho;
import java.util.*;
public class problem8 {
    /*
       input:
          thistest123string
          123
          output:
             8


             incomplete
     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s1= input.next();
        String s2= input.next();
        char str[]=s1.toCharArray();
        char substr[]=s2.toCharArray();
        int ind , ind1 = 0, len= str.length, sublen= substr.length;
        ind = 0 ;
        if(sublen > len)
            System.out.println("-1");
        else {
            while (ind < str.length)
            {
                if (str[ind] == substr[0]) {
                    ind++;
                    ind1 = 1;
                    while ( str[ind] == substr[ind1] && ind1<sublen ) {
                        ind1++;
                        ind++;
                    }
                } else
                    ind++;
            }
            if (sublen == ind1) {
                System.out.println(ind);
            } else {
                System.out.println("-1");
            }
        }
    }
}
