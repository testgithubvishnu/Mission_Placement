//programme on Automorphic number
  import java.util.*;
   public class pro21
  {
    static boolean isAuto(int num)
     {
      int sqr=num*num;
      int sample=sqr;
      while(num!=0)
      {
        if(num%10!=sqr%10)
        {
          System.out.println(sample);
          return false;
        }
       
          else{
            num=num/10;
            sqr=sqr/10;
          }
          
        
      }
      System.out.println(sample);
      return true;
     }
     public static void main(String [] args)
      {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
         int number = input.nextInt();
         boolean result=isAuto(number);

         if(result)
         {
          System.out.println(" Given number is Automorphic");
         }
         else
         {
          System.out.println(" Given number is not Automorphic");
         }
          
  }
}