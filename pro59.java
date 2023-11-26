// Sort first half in ascending order and second half in 
// descending 


import java.util.*;
  public class pro59
{
      public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
        int size,i;
       
       System.out.println("enter the size  of array");
       size=sc.nextInt();
       int [] arr=new int [size];

      System.out.println("enter the array elements");
       for( i=0;i<size;i++)
         {
           arr[i]=sc.nextInt();
         }

   }
}