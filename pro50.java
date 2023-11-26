//. Finding number of integers which has exactly x divisors

import java.util.*;
public class pro50
{

    static int divisor(int y)
    {
        int count=0;
        for(int i=1;i<=y;i++)
        {
            if(y%i==0)
            {
                count++;
            }
        }
        return count;
    }

    static void print_div(int y)
    {
        
        for(int i=1;i<=y;i++)
        {
            if(y%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of divisors:");
        int x=sc.nextInt();

        System.out.println("Enter the range of integers:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        
        System.out.println("Numbers with exactly "+x+" divisors are: ");
        for(int i=start;i<=end;i++)
        {
         int num_div=divisor(i);
         if(num_div==x)
         {
            System.out.println(i);
            System.out.println("Divisors are:");
            print_div(i);
            System.out.println();
         }
        }
        
       
    }
}