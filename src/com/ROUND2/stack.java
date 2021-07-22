package com.ROUND2;
import java.util.*;
public class stack {
    /*
       input: [(](

       output:
              balanced
     */
    public static boolean checkBalance(String s)
    {
        ArrayDeque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if (x == '[' || x == '(' || x =='{')
            {
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
            {
                return false;
            }
            char check;

            switch(x)
            {
                case ')':check=stack.pop();
                         if(x=='[' || x=='{')
                         {
                            return false;
                         }
                         break;
                case '}':check=stack.pop();
                         if(x=='[' || x=='(')
                         {
                             return false;
                         }
                         break;
                case ']':check=stack.pop();
                         if(x=='{' || x=='(')
                         {
                             return false;
                         }
                         break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str= input.next();
        if(checkBalance(str))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not balanced");
        }
    }
}
