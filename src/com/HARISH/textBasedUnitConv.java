package com.HARISH;
import java.util.*;
public class textBasedUnitConv {
    Scanner input=new Scanner(System.in);
    celciusAndCm c=new celciusAndCm();
    kiloAndLitres k=new kiloAndLitres();
    public void getDetails()
    {
        System.out.println("1.Celcius to Fahrenheit");
        System.out.println("2.cm to inches");
        System.out.println("3.kilograms to pounds");
        System.out.println("4.liters to gallons");
        System.out.println("5.Exit");
        int ch=input.nextInt();
        switch(ch)
        {
            case 1: c.getdegree();
                    getDetails();
                    break;
            case 2:
                input.nextLine();
                c.getConversion();
                    getDetails();
                    break;
            case 3:input.nextLine();
                k.getKilograms();
                   getDetails();
                   break;
            case 4:input.nextLine();
                k.getLitres();
                   getDetails();
                   break;
            case 5:return;
            default: System.out.println("Enter a valid option");
                     return;
        }
    }
    public static void main(String args[])
    {
       textBasedUnitConv t=new textBasedUnitConv();
       t.getDetails();
    }
}
