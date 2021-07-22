package com.pattern;
import java.util.*;
public class p5 {
    public static void main(String args[])
    {
        int a=30,b=50;
        System.out.println("Before swapping....."+a+" "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swapping....."+a+" "+b);
    }
}
