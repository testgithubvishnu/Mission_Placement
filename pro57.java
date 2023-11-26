// Calculate sum of elements in given array
   import java.util.*;
    public class pro57 {
        public static void main(String [] args)
          {
           Scanner sc = new Scanner(System.in);
              int size,i;
              System.out.println("enter the size of array:");
               size=sc.nextInt();
             int[] arr=new int[size];
           

            System.out.println("enter the array elements:");
             for(i=0;i<size;i++)
               {
                arr[i]=sc.nextInt();
              }
             int sum=0;
               for(i=0;i<size;i++)
               {
                sum=(sum+arr[i]);
              }
            System.out.println("Sum of given array elements:"+sum);
     }
 }