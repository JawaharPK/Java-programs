package com.NEW;
import java.util.*;
public class askMom {
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Is there another person in the house");

            String value = sc.nextLine();
            if(value.equals("yes"))
            {
                System.out.println("Did you ask the either parent");
                String a = sc.nextLine();
                if(a.equals("yes"))
                {
                    System.out.println("Did you get what you needed?");
                    String b = sc.nextLine();
                    if(b.equals("yes"))
                    {
                        System.out.println("Good Job");
                    }
                    else
                    {
                        System.out.println("Are you bleeding");
                        String d = sc.nextLine();
                        if(d.equals("yes"))
                        {
                            System.out.println("Ask Mom");
                        }
                        else
                        {
                            System.out.println("Can you google it");
                            String e = sc.nextLine();
                            if(e.equals("yes"))
                            {
                                System.out.println("Do that");
                            }
                            else
                            {
                                System.out.println("Ask Mom");
                            }
                        }
                    }
                }
                else
                {
                    System.out.println("Do that.");
                }
            }
            else
            {
                System.out.println("is Mom Busy");
                String a = sc.nextLine();
                if(a.equals("yes") || a.equals("no"))
                {
                    if(a.equals("no"))
                    {
                        System.out.println("Yes, she is");
                    }

                    System.out.println("Is it urgent");
                    String b = sc.nextLine();
                    if(b.equals("yes"))
                    {
                        System.out.println("no, but like actually urgent");
                        String c = sc.nextLine();
                        if(c.equals("yes"))
                        {
                            System.out.println("Are you bleeding");
                            String d = sc.nextLine();
                            if(d.equals("yes"))
                            {
                                System.out.println("Ask Mom");
                            }
                            else
                            {
                                System.out.println("Can you google it");
                                String e = sc.nextLine();
                                if(e.equals("yes"))
                                {
                                    System.out.println("Do that");
                                }
                                else
                                {
                                    System.out.println("Ask Mom");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Can you google it");
                            String e = sc.nextLine();
                            if(e.equals("yes"))
                            {
                                System.out.println("Do that");
                            }
                            else
                            {
                                System.out.println("Ask Mom");
                            }
                        }
                    }
                }
            }
        }
    }
