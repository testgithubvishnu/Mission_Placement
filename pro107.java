 //Anagram strings are those strings in which by rearranging the charactors of
//first string we can construct second string
//Ex.like LIVE-EVIL ,RACE-CARE etc
import java.util.*;
public class pro107
{
     public static void main(String[] args)
     {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter first string:");
    String str1=sc.nextLine();

     System.out.println("enter second string:");
    String str2=sc.nextLine();
    if(str1.length()==str2.length())
    {
        char []arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result=Arrays.equals(arr1,arr2);

        if(result)
        {
             System.out.println("Strings are anagram");
        }
          else
        {
             System.out.println("Arrays are not anagram");
        }
    }
    
    }
}