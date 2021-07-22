package com.HARISH;
import java.util.*;
public class celciusAndCm  {
    Scanner input=new Scanner(System.in);
    void getdegree()
    {
        System.out.println("Enter celicus");
        int celcius= input.nextInt();
        int fah=((celcius*2)+30);
        System.out.println("Fahrenheit: "+fah+" ^F");
    }
    void getConversion()
    {
        System.out.println("Choose input unit:");
        System.out.println("1.cm");
        System.out.println("2.inches");
        int inp= input.nextInt();
        if(inp==1)
        {
            System.out.println("Enter the value in cm");
            int cm= input.nextInt();
            float inch= (float) (cm*0.39370);
            System.out.println(cm+" cm = "+inch+" inches");
        }
        if(inp==2)
        {
            System.out.println("Enter the value in inches");
            float inch= input.nextFloat();
            int cm=(int)(inch/0.39370);
            System.out.println(inch+" inches= "+cm+" cm");
        }
    }
}
