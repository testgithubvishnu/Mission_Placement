// leap or year not
    import java.util.*;
      public class pro8{
        
        static void leap_y(int yr)
        {
           if(yr%400==0)
              {
               System.out.println("Given year is leap");
               }
               else if(yr%4 == 0 && yr%100!=0 )
               {
                 System.out.println("Given year is leap");
               }
              else
               {
                System.out.println("Given year is not leap");             
                }
        }
       public static void main(String [] args)
        {
         Scanner input = new Scanner(System.in);
          
           System.out.println("Enter the year:");
           int year = input.nextInt();
           leap_y(year);
            
        }
   }