//programme to know whether given number is perfect,abundant or deficient
   import java.util.*;
   import java.lang.*;
   public class pro23{
     public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      System.out.println("enter any number");
      int num=input.nextInt();
       int sum=0,i;
      
       for(i=0;i<num;i++)
        {
         if(num%i==0)
          {
           sum=sum+i;
         }
      }
      if(sum==num)
       {
       System.out.println("given number is perfect");
      }
      else if(sum>num)
       {
        System.out.println("given number is abundant ");
      }
      else
       {
     System.out.println("given number is deficient");
      }
   }

}


 