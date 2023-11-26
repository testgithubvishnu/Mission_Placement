            
import java.util.*;
public class pro103
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        String num="";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
               num=num+str.charAt(i);
            }
            else{
                if(num.equals(""))
                {
                    sum=sum+Integer.parseInt(num);
                    num="";
                }
            }
        }
        System.out.println("Sum of digits is: "+sum);

    }
}