//programme on Armstrong number
    import java.util.*;
    import java.lang.Math;
     public class pro14
      {
        

        static int raised_pow(int num0)
        {
           int power=0;
         while(num0!=0)
         {
          int rem=num0%10;
          power++;
          num0=num0/10;
         }
         return power;

        }

        static boolean armst(int num)
        {
         int powr=raised_pow( num);
         int temp=num;
         int sum=0;

         while(temp!=0)
         {
          int rem=temp%10;
          sum+=Math.pow(rem,powr);
          temp=temp/10;
         }
         
         return (sum==num);
        }


     public static void main(String [] args)
       {
     Scanner input = new Scanner (System.in);
      System.out.println("enter any number");
      int n=input.nextInt();
       
       
     if(armst(n))
      System.out.println("given number is armstrong");
      else
       System.out.println("given number is not armstrong");

   }
}
      