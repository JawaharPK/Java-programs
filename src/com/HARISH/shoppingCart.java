package com.HARISH;
import java.util.*;
public class shoppingCart {
    /*
Enter Somu's budget:
40
Enter the item:
13
Enter the item:
23
Enter the item:
60
The budget exceeded
Total price of items is 36

     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Somu's budget:");
        int bud= input.nextInt();
        int i=1;
        int sum=0;
        int item;
        while(i>0)
        {
            System.out.println("Enter the item:");
            item= input.nextInt();
            sum+=item;
            if(sum>bud)
            {
                System.out.println("The budget exceeded");
                System.out.println("Total price of items is "+(sum-item));
                i=0;
            }
        }
    }
}
