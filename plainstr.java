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
          for(int i=0;i<given.Length();i++)
            {
              rev=rev+i;
            }
          System.out.println("Reverse string:"+rev)
           if(rev==given)
           System.out.println("given string is palindrome");
          else
          System.out.println("given string is not palindrome");
        }
  }