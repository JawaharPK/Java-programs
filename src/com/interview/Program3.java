package com.interview;
import java.util.*;
import java.util.regex.*;
public class Program3 {
    public static void checkPassword(String s)
    {
        String regex="(?=.*[0-12])"+"(?=.*[a-z]) (?=.*[A-Z])"
                +"(?=.*[@#$%]^&+=])";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        if(s==null)
        {
            System.out.print("valid Password");
        }
        else
            {
            System.out.print("Invalid Password");
        }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s= input.next();
        checkPassword(s);
    }
}
