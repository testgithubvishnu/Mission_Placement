import java.util.*;
public class pro97
{
    static String removow(String str1)
    {
        char [] newstr =new char[12];
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=('a'||'e'||'i'||'o'||'u'))
            {
                newstr[i]=str1.charAt(i);
                i++;
            }
        }
        System.out.println(newstr);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();

        removow(str);
    }
}