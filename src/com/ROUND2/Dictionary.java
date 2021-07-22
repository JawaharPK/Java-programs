package com.ROUND2;
import java.util.*;
public class Dictionary {
    public static void dict(char[][] arr,String brr[])
    {
        ArrayList al=new ArrayList();
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
                al.add(arr[i][j]);
            }
            System.out.println();
        }
        String str="";
       for(int i=0;i< brr.length;i++)
       {
           str+=brr[i].toString();
           str+=" ";
       }
        System.out.println(str);
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
         char arr[][]={{'a','z','o','l'},
                       {'n','x','h','o'},
                      {'v','y','i','v'},
                      {'o','r','s','e'}};
         String brr[]={"van", "zoho", "love", "are", "is"};
         dict(arr,brr);
    }
}
