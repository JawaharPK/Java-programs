package com.ROUND2;
import java.util.*;
public class TwistedPrimeNumber {
    static Boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    static int reverse(int n)
    {
        int rev=0,r,c;
        r=n%10;
        c=n/10;
        rev=r*10+c;
        return rev;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(isPrime(n))
        {
            System.out.println(n+" "+"is a prime number");
            int rev=reverse(n);
            if(isPrime(rev))
            {
                System.out.println(rev + " " + "is a prime number");
            }
            else
            {
                System.out.println(rev+" "+"is not a prime number");
            }
        }
        else
        {
            System.out.println(n+" "+"is not a prime number");
            int rev=reverse(n);
            if(isPrime(rev))
            {
                System.out.println(rev + " " + "is a prime number");
            }
            else
            {
                System.out.println(rev+" "+"is not a prime number");
            }
        }

    }
}





