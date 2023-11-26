import java.util.*;
public class pro29
{
    public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter octal string");
    
     String str=sc.nextLine();
     int dec=Integer.parseInt(str,8);
     System.out.println(dec);
    }
}