//TO FIND THE MISSING NUMBER IN AN ARRAY:

import java.io.*;
import java.util.*;

public class missing_num_in_arr
{
    static void missing_num(int[] arrn)
    {
        int arraySum=0;
        int expectLength=arrn.length+1;
        int totalSum = (expectLength * (expectLength+1))/2;

        for(int i=0;i<arrn.length;i++)
        {
             arraySum=arraySum+arrn[i];
        }

        int missing_number=totalSum-arraySum;
        System.out.println("missing number is: "+missing_number);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int len= sc.nextInt();
         int[] arr=new int[len];
      
      System.out.println("Enter elements of array:");
      for( int i=0;i<len;i++)
      {
        arr[i]=sc.nextInt(); 
      }

      missing_num(arr);
    }
}