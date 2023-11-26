 import java.util.*;
  public class pro3{
     public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     int n,i;
     System.out.println("enter any number");
      n= sc.nextInt();
     int sum=0;
   
     for(i=0;i<=n;i++)
     {
        sum=sum+i;
      }
     System.out.println("sum of "+n+" numbers is "+sum);
 }
}