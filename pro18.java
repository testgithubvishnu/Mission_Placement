// to find power of given number
   import  java.util.*;
    public class pro18{
        public static void main(String [] args)
       {
         Scanner sc = new Scanner(System.in);
         int val=1,power,num;
           System.out.println("Enter any number:");
            num = sc.nextInt();
         
           System.out.println("Enter the power of number");
          power = sc.nextInt();
               
               for(int i=0; i<power;i++)
              {
                val=val*num;
              }
           System.out.println("Power of given number is:"+val);
       }
  }