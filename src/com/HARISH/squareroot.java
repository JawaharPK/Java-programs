package com.HARISH;
import java.text.DecimalFormat;
import java.util.*;
public class squareroot {
    /*
      input:
           enter a number:
           4
       output:
           sqr root is 2
     */

    private static DecimalFormat df3 = new DecimalFormat("#.###");
    public static double squareRoot(int num)
    {
        double t;
        double sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res=squareRoot(n);
        System.out.println("The square root of "+ n+ " is: ");
        System.out.println(df3.format(res));
    }
}
