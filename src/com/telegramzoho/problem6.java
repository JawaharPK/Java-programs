package com.telegramzoho;
import java.util.*;
public class problem6 {
    /*
       input:
          12345 45123
       output:
           yes
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        long num1, num2, power, nod, rotate;
        num1 = input.nextInt();
        num2 = input.nextInt();
        power = 1;
        nod = 0;
        while ((num1 / power) != 0)
        {
            power *= 10;
            nod++;
        }
        power /= 10;     //10000
        rotate=num1;
        while(rotate!=num2 && nod!=0)
        {
            rotate=(rotate%10)*power+(rotate/10);
            nod--;
        }
        if(rotate==num2 && nod!=0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
//123456789 678912345