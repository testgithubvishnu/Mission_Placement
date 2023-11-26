import java.util.*;
public class pro98
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        String original=str;
        String reverse="";
        for(int i= str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
         if(original==reverse)
         {
        System.out.println("Given string is Palindrome");
        }
         else
            {
             System.out.println("Given string is not Palindrome");
            }
    }
}