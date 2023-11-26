// prime number within the range
     import java.util.*;
       public class pro10{
          public static void main(String [] args)
          {
           Scanner sc= new Scanner(System.in);
            System.out.println("Enter the range");
             int start,end;
            start=sc.nextInt();  
            end=sc.nextInt();
         
         System.out.println("prime numbers between "+start+" to "+end +" are:"); 
         for(int i=start;i<=end;i++)
       {
         int j,count=0;
         for(j=1;j<=i;j++)
          {
           if(i%j==0)
             count++;
          }
           if(count<=2)
            System.out.print(i+" ");
       } 
          
         // System.out.println("prime numbers between "+start+" to "+end +"are:");
          // System.out.print(j+" ");
             
     }
  }       
          
                      