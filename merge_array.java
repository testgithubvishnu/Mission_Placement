//PROGRAMME TO MERGE TWO ARRAYS:

import java.util.*;
public class merge_array
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int len1,len2,i;
        
         System.out.println("Enter length of first array:");
        len1=sc.nextInt();

          System.out.println("Enter length of second array:");
        len2=sc.nextInt();

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        int len_merge=len1+len2;
        int[] merge= new int[len_merge];

       

     System.out.println("Enter elements of first array:");
    for(i=0;i<len1;i++)
    {
        arr1[i]=sc.nextInt();
        merge[i]=arr1[i];
    }

     System.out.println("Enter elements of second array:");
    for(i=0;i<len2;i++)
    {
        arr2[i]=sc.nextInt();
        merge[len1+i]=arr2[i];
    }

    System.out.println("Array merging after two arrays:");
    for(i=0;i<len_merge;i++)
    {
        System.out.print(merge[i]+" ");
    }

        
    }
}