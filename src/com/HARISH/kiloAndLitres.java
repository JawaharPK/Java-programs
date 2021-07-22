package com.HARISH;
import java.util.*;
 public class kiloAndLitres {
     Scanner input=new Scanner(System.in);
     void getKilograms()
     {
         System.out.println("Enter the value in kgs:");
         int kgs=input.nextInt();
         float lb= (float) (kgs*2.2046);
         System.out.println(kgs+" kgs = "+lb+" pounds ");
     }
     void getLitres()
     {
         System.out.println("Enter the litres:");
         float lit=input.nextFloat();
         float gal=(float)(lit*0.2641);
         System.out.println(lit+" litres = "+gal+" galoons ");
     }
}
