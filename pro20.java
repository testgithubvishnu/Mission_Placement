//programme on perfect number
   import java.util.*;
   public class pro20{
     public static void main(String[] args)
    {
      int num,sum=0;
      
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter any number:");
       num = sc.nextInt();
       int temp=num;
       for(int i=1;i<=num;i++)
        {
          if(num%i==0)
          {
          sum=sum+i;
          }
        }
         if(sum==temp)
            {
          System.out.println("given number is perfect number");
            }
          else
         {
          System.out.println("given number is not perfect number");
         }

      }
  }
