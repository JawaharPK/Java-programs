package com.ROUND2;
import java.util.*;

public class maxMin
{
    public static void sortOddEven(int a[])
    {
        Arrays.sort(a);
        ArrayList odd=new ArrayList();
        ArrayList even=new ArrayList();
        /*
input:
     3 4 5 2 1 7 8 6
output:
     7 2 5 4 3 6 1 8

*/
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                odd.add(a[i]);
                /*
                 1 3 5 7
                 */
            }
            else
            {
                even.add(a[i]);
                /*
                 2 4 6 8
                 */
            }
        }
        int n=a.length/2;
        for(int i=0;i<n;i++)
        {
            System.out.print(odd.get(n-i-1)+" "+even.get(i)+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        sortOddEven(a);
    }
}
