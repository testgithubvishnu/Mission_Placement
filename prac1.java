// Programme to find the ASCII value of given word

import java.util.*;
import java.lang.*;
public class prac1
{
     static void ascii(String str)
     {
     int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum=sum+str.charAt(i);
        }
        System.out.println("ASCII value of given string is : "+sum);
     }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word :");
        String string= sc.nextLine();
        ascii(string);

       
    }
}