  // Greatest of the three numbers

       import java.util.*;
       public class pro7{
        public static void main(String [] args)
         {
           Scanner  sc = new Scanner(System.in);
           System.out.println("Enter any three numbers:");
           int n1,n2,n3;
           n1= sc.nextInt();
           n2= sc.nextInt();
           n3= sc.nextInt();
        
          if(n1>n2 && n1>n3)
          {
         System.out.println("Greatest number among three is:"+n1);
         }
           else if(n2>n1 && n2>n3)
          {
         System.out.println("Greatest number among three is:"+n2);
         }
         else
         {
         System.out.println("Greatest number among three is:"+n3);
           }
    }
 }
         
           