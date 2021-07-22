package com.telegramzoho;
import java.util.*;
public class problem19 {
    /*
Sample Input 1
Malayalam is my mother tongue

Sample Output 1
is my mother tongue
     */
    static boolean isPalindrome(String word)
    {
      int i=0,j=word.length()-1;
      while(i<j)
      {
          if(word.charAt(i++)!=word.charAt(j--))
          {
              return false;
          }
      }
      return true;
    }
    public static String removePalindrome(String str)
    {
       String final_word="",word="";
       str=str+" ";
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)!=' ')
           {
               word+=str.charAt(i);
           }
           else
           {
               if(!(isPalindrome(word)))
               {
                   final_word+=word+" ";
               }
               word="";
           }
       }
       return final_word;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        System.out.println(removePalindrome(s1));
    }
}
