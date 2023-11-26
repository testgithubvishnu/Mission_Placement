/*programme to reverse an array */

import java.util.*;
  public class pro58
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

     System.out.println("here is your array:");
        for(i=0;i<size;i++)
         {
          System.out.println(arr[i]);
         }

       System.out.println("reverse of given array:");
        for(i=size-1;i>=0;i--)
         {
          System.out.println(arr[i]);
           }
     
   }
}

 
       

