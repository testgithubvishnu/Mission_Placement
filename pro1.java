//programme to determine number positive or negative 
  import java.util.*;
  public class pro1{
        public static void main(String [] args)
        {
         Scanner input = new Scanner(System.in);
         System.out.println("enter a number");
         int num=input.nextInt();
         
          if(num>0)
           System.out.println("given number is positive");
          else
             System.out.println("given number is negative");
        }
    } 