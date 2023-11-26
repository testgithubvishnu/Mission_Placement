import java.util.*;
public class palindrome{
 public static void main(String [] args)
   {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter any number");
   int n = sc.nextInt();
   int sum=0,rem;
     int temp=n;
   
   while(n>0)
    {
       rem=n%10;
       sum=sum*10+rem;
       n=n/10;

   }
    if(sum==temp)
      {
        System.out.println("given number is palindrome");
      }
    else
        {
        System.out.println("given number is not palindrome");
        }
  }
}