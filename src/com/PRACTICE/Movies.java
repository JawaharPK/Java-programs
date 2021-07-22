package com.PRACTICE;
import java.util.*;
public class Movies {
    String mvname;
    String mvtime;
    String mvprice;
    int availseats=100;
    int nooftic;
    int [][]seats=new int[10][10];
    Scanner input=new Scanner(System.in);

    Movies(String mvname,String mvtime,String mvprice)
    {
        this.mvname=mvname;
        this.mvtime=mvtime;
        this.mvprice=mvprice;
        int s=1;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                seats[i][j]=s;
                s++;
            }
        }
    }
    public void showmovie()
    {
        System.out.println("-------------------------------------");
        System.out.println("Movie Name:"+mvname);
        System.out.println("Movie Time:"+mvtime);
        System.out.println("Movie Price:"+mvprice);
        System.out.println("Seat Availability:"+availseats);
        System.out.println("-------------------------------------");
    }
    public int[] book()
    {
        System.out.println("Enter the no of tickets:");
        int nooftic= input.nextInt();
        viewseat();
        int[] bookedseat=new int[nooftic];
        for(int i=0;i<nooftic;i++)
        {
            System.out.println("Enter the seat number for person"+(i+1));
            int seatno=input.nextInt();
            for(int j=0;j<10;j++)
            {
                for(int k=0;k<10;k++)
                {
                    if(seats[j][k]==seatno)
                    {
                        seats[j][k]=-1;
                        bookedseat[i]=seatno;
                    }
                }
            }
        }
        return bookedseat;
    }
    void viewseat()
    {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------------SCREEN----------------------");
        System.out.println("--------------------------------------------------");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(" | "+seats[i][j]);
            }
            System.out.println("\n-------------------------------------------------");
        }
        System.out.println("\n-1 means Seat is booked..\n");
    }


}
