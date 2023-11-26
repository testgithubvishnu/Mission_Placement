import java.util.*;
import java.lang.*;
 
 public class pro105
 {
        static int char_freq(String str1,char ch)
        {
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            
            if(str1.charAt(i)==ch)
            {
                count++;
            }
        }
        return count;
        }

         public static void main(String[] args)
       {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();

       for(int i=0;i<str.length();i++)
       {
        
        int count=char_freq(str,str.charAt(i));
        System.out.println("Frequency of "+str.charAt(i)+" is"+" "+count);
        
       }
    }
 }