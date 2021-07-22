package com.ROUND2;
import java.util.*;
public class passwordStrength {

    public static void passtren(String s)
    {
       boolean hasDigit=false,hasSpecialchar=false,hasUpper=false,hasLower=false;
       int n=s.length();
        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
       for(char i:s.toCharArray())
       {
           if(Character.isLowerCase(i))
           {
              hasLower=true;
           }
           else if(Character.isUpperCase(i))
           {
               hasUpper=true;
           }
           else if(Character.isDigit(i))
           {
               hasDigit=true;
           }
           else if(set.contains(i))
           {
               hasSpecialchar=true;
           }
       }
       if(hasUpper && hasLower && hasSpecialchar && hasDigit && n>=8)
       {
           System.out.println("...............");
           System.out.println("Strong password");
           System.out.println("...............");
       }
       else if((hasUpper && hasDigit ) && n>=8)
       {
           System.out.println("...............");
           System.out.println("Good password");
           System.out.println("...............");
       }
       else if(n>=8 && hasUpper)
       {
           System.out.println("...............");
           System.out.println("Medium password");
           System.out.println("...............");
       }
       else if(n<5)
       {
           System.out.println("...............");
           System.out.println("Weak password");
           System.out.println("...............");
       }


    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int times=4;
        for(int i=1;i<=4;i++) {
            String s = input.next();
            passtren(s);
        }
    }
}
