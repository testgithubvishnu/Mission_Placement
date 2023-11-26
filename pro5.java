// sum of numbers in given range
     import java.util.*;
       public class pro5{
         public static void main(String [] args)
          {
             Scanner sc = new Scanner (System.in);
             System.out.println("Enter the range of numbers:");
              int sum=0, start,end;
              start=sc.nextInt();
              end=sc.nextInt();
                 
             for(int i=start;i<=end;i++)
                {
                   sum = sum+i;
                 }
             System.out.println("sum numbers from "+start+" to "+end+"is: "+sum); 
        }
   }  