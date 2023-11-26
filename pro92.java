import java.util.*;
    public class pro92{

     static void sqrsum(int n)
     {
        int sum=0;
       while(n!=0)
       {
        int rem=n%10;
        sum=sum+rem*rem;
        n=n/10;
       }
       System.out.println("Square sum of given number is:"+" "+sum);
     }
    
     public static void main(String [] args)
      {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=input.nextInt();

        sqrsum(num);
      }
    }