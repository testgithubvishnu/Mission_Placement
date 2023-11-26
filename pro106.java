import java.util.*;
import java.lang.*;

public class pro106
{
    static void non_rpt(String str1,char ch)
    {
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            
            if(str1.charAt(i)==ch)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.print(ch+" ");
        }
    }
    public static void main(String[] args)
    {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();

        System.out.println("Non-repeating charactors are : ");
        for(int i=0;i<str.length();i++)
        {
        non_rpt(str,str.charAt(i));
        }


    }
}