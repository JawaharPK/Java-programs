package com.ROUND2;
import java.util.*;
public class  removePalindrome
{

    /*
        Input:
He did a good deed

Output:
He good

Input:
Hari speaks malayalam
Output:
Hari speaks
     */

        static boolean isPalindrome(String str)
        {
            int i = 0, j = str.length() - 1;
            while (i < j)
            {
                if (str.charAt(i++) != str.charAt(j--))
                    return false;
            }
            return true;
        }
        static String removePalinWords(String str)
        {
            String final_str = "", word = "";
            str = str + " ";
            int n = str.length();
            char arr[]=str.toCharArray();
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i]!= ' ')
                {
                    word = word + arr[i];
                    System.out.println(word);
                }
                else
                {
                    if (!(isPalindrome(word)))
                    {
                        final_str += word + " ";
                    }
                    word = "";
                }
            }
            return final_str;
        }
        public static void main (String[] args)
        {
            Scanner input=new Scanner(System.in);
            String str =input.next();
            System.out.print(removePalinWords(str));
        }
}

