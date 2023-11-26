
import java.util.*;
public class pro27
{
public static void main(String[] args)
{
    int n1,n2;
 Scanner sc = new Scanner(System.in);

System.out.println("Enter any two number");
   n1=sc.nextInt();
    n2=sc.nextInt();

    if(n1>n2)
    {
        int i,cd;
        int gcd=0;
        for(i=1;i<=n1;i++)
        {
            if(n1%i==0 && n2%i==0 && i>gcd)  
            {
                 gcd=i;
            }      
        }
        System.out.println(gcd);  

    }
    else
    {
       int i,cd;
        int gcd=0;
        for(i=1;i<=n2;i++)
        {
            if(n1%i==0 && n2%i==0 && i>gcd)  
            {
                 gcd=i;
            }      
        } 
        System.out.println(gcd);  

    }

   
  }
}