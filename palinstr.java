// To check whether the given string is palindrome or not
   import java.util.*;
   import java.io.*;
   public class palinstr{
     public static void main(String [] args)
       {
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter the stirng");
          String given =sc.nextLine();
          
          System.out.println("original string:"+given);
          String rev=" ";
          for(int i=given.length();i>=0;i++)
            {
              rev=rev+given.charAt(i);
            }
          System.out.println("Reverse string:"+rev);
           if(rev==given)
           System.out.println("given string is palindrome");
          else
          System.out.println("given string is not palindrome");
        }
  }