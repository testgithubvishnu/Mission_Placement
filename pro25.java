// find hcf of given numbers
   import java.util.*;
    public class pro25{
         public static void main(String [] args)
       {
     Scanner sc = new Scanner(System.in);
      System.out.println("enter any two numbers:");
     int a=sc.nextInt();
     int b=sc.nextInt();
      while(a!=b)
       {
         if(a>b)
          a=a-b;
         else
         b=b-a;
        }
      System.out.println(a);
       
    }
}