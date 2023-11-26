 //Counting number of days in a given month of a year 
 import java.util.*;
 public class pro48
 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the month:");
        int month=sc.nextInt();

         System.out.println("Enter the Year:");
        int year=sc.nextInt();
      
        if(month==2)
        {
            if(year%400==0||((year%4==0)&&(year%100!=0)))
            {
                System.out.println("Days are: "+29);
            }
            else
            {
              System.out.println("Days are: "+28);  
            }
        }
        else if((month==1)||(month==5)||(month==3)||(month==8)||(month==7)
        ||(month==10)||(month==12))
        {
       System.out.println("Days are: "+31);
        }
   
        else
        {
             System.out.println("Days are: "+30);
        }
        
    }
 }