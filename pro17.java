// factorial of given number
     import java.util.*;
       public class pro17{
         public static void main(String [] args)
       {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number");
         int num=sc.nextInt();
        int fact = 1;
        
         while(num!=0)
           {
             fact=fact*num;
             num--;
             
            }
           System.out.println("Factorial of given number "+fact);
       }
  }