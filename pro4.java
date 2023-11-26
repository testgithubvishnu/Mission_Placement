// sum N natural numbers
   import java.util.*;
     public class pro4{
        public static void main(String [] args)
     {
        Scanner sc=new Scanner (System.in);
         System.out.println("Enter how many numbers:");
         int size = sc.nextInt();
         int[]  xyz= new int[size];
          int k,sum=0;
           
          System.out.println("Enter the numbers:");
           for(k=0;k<size;k++)
             {
                xyz[k]=sc.nextInt();   
              }
              for(k=0;k<size;k++)
             {
                sum = sum+xyz[k];  
              }
              System.out.println("sum of given "+size+" numbers is:"+sum);
       }
   }        
                      