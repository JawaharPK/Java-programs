package com.ROUND2;
import javax.swing.*;
import java.util.*;
public class versionNumber {

    /*
      input:
           version1: 4.1.2

      output:
           version2= 4.3.6
     */

    public static int convertString(String version1,String version2)
    {
        List<String> s1= new ArrayList<String>(Arrays.asList(version1.split("\\.")));
        List<String> s2= new ArrayList<String>(Arrays.asList(version2.split("\\.")));
        int i=0;
        String res =" ";
         if(s1.size()>s2.size())
         {
             s2.add("0");
         }
         else if(s2.size()>s1.size())
         {
             s1.add("0");
         }
         while(i<s1.size()&&i<s2.size())
         {
             int a=Integer.parseInt(s1.get(i));
             int b=Integer.parseInt(s2.get(i));
             if(a<b)
             {
                 System.out.println("Upgraded");
                 return 0;
             }
             else if(a>b)
             {
                 System.out.println("Downgraded");
                 return 0;
             }
             else
             {
                 i++;
             }
         }
        System.out.println("Both are equal");
         return 0;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String1:");
        String s1=input.next();
        System.out.println("Enter String2:");
        String s2=input.next();
        convertString(s1,s2);

    }
}
