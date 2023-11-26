//programme on Harshad number
  import java.util.*;
  public class pro22{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
     System.out.println("enter any number ");
    int n=sc.nextInt();
     int temp=n;
     int sum=0,rem;
      while(n!=0)
       {
         rem=n%10;
         sum=sum+rem;
         n=n/10;
       }
       if(temp%sum==0)
         {
         System.out.println("given number is harshad");
          }
        else
             {
          System.out.println("given number is not harshad");
            }
     }
}
        





