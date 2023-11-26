// to find the factors of given number
   import java.util.*;
   public class pro19{
       public static void main(String [] args)
     {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter any number");
          int n=sc.nextInt();
        System.out.println("Factors of given number are:");
          for(int i=1;i<=n;i++)
           {
             if(n%i==0)
               System.out.print(i+" "); 
            }
    }
 }