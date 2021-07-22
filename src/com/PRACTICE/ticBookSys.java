package com.PRACTICE;

import java.util.*;
public class ticBookSys {
    Scanner input=new Scanner(System.in);
    ArrayList<Movies>mov =new ArrayList<Movies>();
    ArrayList<Ticket>tickets=new ArrayList<Ticket>();
    public void getchoice()
    {

        System.out.println("1.Show Moives:");
        System.out.println("2.Book ticket:");
        System.out.println("3.View ticket:");
        System.out.println("4.Cancel ticket:");
        int ch=input.nextInt();
        switch(ch)
        {
            case 1:Movies m1=new Movies("Viswasam","10 am","90");
                   mov.add(m1);
                   Movies m2=new Movies("Petta","1 am","80");
                   mov.add(m2);
                   for(Movies x:mov)
                   {
                       x.showmovie();
                   }
                   getchoice();
                   break;

            case 2:
                input.nextLine();
                System.out.println("Enter movie Name:");
                String mn=input.nextLine();
                String mt="";
                String pr="";
                int noftic=0;
                int loc=0;
                for(Movies x:mov){
                    if((x.mvname).equalsIgnoreCase(mn)){
                        mn=x.mvname;
                        mt=x.mvtime;
                        pr=x.mvprice;
                        noftic=x.nooftic;
                        int[] seats=x.book();
                        mov.set(loc,x);
                        int id=tickets.size();
                        tickets.add(new Ticket(id,mn,mt,pr,x.nooftic,seats));
                        System.out.println("your Ticket Id is "+id);
                        System.out.println("seats are :"+Arrays.toString(seats));
                    }
                    loc++;
                }
                getchoice();
                break;

            case 3:
                  input.nextLine();
                System.out.println("Enter the ticket id:");
                int tid=input.nextInt();
                Ticket t=tickets.get(tid);
                t.showticket();
                getchoice();
                break;

            case 4:
                 input.nextLine();
                System.out.println("Enter the ticket id:");
                int id= input.nextInt();
                Ticket c= tickets.get(id);
                int loc1=0;
                for(Movies a:mov) {
                    for(int sn:c.bookseats)
                    {
                    int def = 1;
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            a.seats[i][j] = def;
                        }
                    }
                    mov.set(loc1,a);
                    }
                    loc1++;
                }
                System.out.println("Ticket cancelled........Succesfully");
                getchoice();
                break;
                case 5:
                   return;
            default:
                System.out.println("Enter a valid choice");
        }
    }
    public static void main(String args[])
    {
        ticBookSys s=new ticBookSys();
        s.getchoice();
    }
}
