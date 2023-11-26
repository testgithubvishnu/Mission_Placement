// prime number test
    import java.util.*;
      public class pro9{
         public static void main(String [] args)
      {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter any number:");
         int num = sc.nextInt();
           int i,count=0;
         for(i=1;i<=num;i++)
          {
           if(num%i==0)
             count++;
          }
          if(count>2)
           {
          System.out.println("Given number is not prime");
          }
          else
          {
          System.out.println("Given number is prime");
          
          }
       }
    }