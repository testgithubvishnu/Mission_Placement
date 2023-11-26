//programme on palindrome number
   import java.util.*;
   public class pro13
    {
     public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any number");
       int n=sc.nextInt();
       int temp=n;
       int rev=0,rem;
       while(n!=0)
       {
          rem=n%10;
          rev=rev*10+rem;
           n=n/10;

        }
        if(rev==temp)
         {
         System.out.println("given number is palindrome");
         }
         else
         {
         System.out.println("given number is not palindrome");
           }
      }
      
  }
