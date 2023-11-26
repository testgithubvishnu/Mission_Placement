import java.util.*;
public class pro95
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String st= sc.nextLine();

        char []str=st.toCharArray();

        for (int i=0;i<str.length;i++)
        {
           if(str[i]>='A' && str[i]<='Z')
           {
            str[i]=(char)(str[i]+'a'-'A');
           }
           else if(str[i]>='a' && str[i]<='z')
           {
            str[i]=(char)(str[i]+'A'-'a');
           }
        }

        System.out.println("String after toggle: "+String.valueOf(str));
    }
}