package com.PRACTICE;

import java.util.Arrays;

public class Ticket {


    int ticketId;
    String mvName;
    String mvTime;
    String mvPrice;
    int tofper;
    int[] bookseats;
    Ticket(int ticketId,String mvName,String mvTime, String mvPrice,int tofper,int[] bookseats){
        this.ticketId=ticketId;
        this.mvName=mvName;
        this.mvTime=mvTime;
        this.mvPrice=mvPrice;
        this.tofper=tofper;
        this.bookseats=bookseats;
    }
    public void showticket(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Ticket Id : "+ticketId);
        System.out.println("Movie Name : "+mvName);
        System.out.println("Movie Time : "+mvTime);
        System.out.println("Ticket Price : "+mvPrice);
        System.out.println("Total no of persons :"+tofper);
        System.out.println("seats are :"+ Arrays.toString(bookseats));
        System.out.println("-------------------------------------------------------");

    }

}
