package com.NEW;
import java.util.*;
public class removeBraces
{
    /*
    Input ((X){2}(y){3}(z)){2}

Output xxyyyzxxyyyz
     */
    public static String removeBrace(String s)
    {
        if(s.contains("{") || s.contains("("))
        {
            s=s.replaceAll("\\{","");
            s=s.replaceAll("\\(","");
        }
        if(s.contains("}") || s.contains(")"))
        {
            s=s.replaceAll("\\}","");
            s=s.replaceAll("\\)","");
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        removeBraces r=new removeBraces();
        String s=input.next();
        String n=removeBrace(s);
        String res="";
        for(int i=0;i<n.length();i+=2)
        {
            int times=Integer.parseInt(String.valueOf(n.charAt(i+1)));
            for(int j=1;j<=times;j++)
            {
                res+=n.charAt(i);
            }
        }
        System.out.println(res);
    }
}
