//To check wheteher a given number can be represented as the sum of two numbers

import java.util.*;
public class pro39
{
    static boolean checkPrime(int n)
    {
        boolean isprime=true;
        for(int i=2;i<=n/2;++i)
        {
            if(n%i==0)
            {
                isprime=false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        boolean flag=false;
        for(int i=2;i<num;i++)
        {
            if(checkPrime(i))
            {
                if(checkPrime(num-i))
                {
                    System.out.println("Number "+num +" is a sum of "+i+" and "+(num-i));
                    flag=true;
                }
            }
        }
         if(!flag)
         {
            System.out.println("Number cant be expressed as sum of two primes");
         }


     
    }
}