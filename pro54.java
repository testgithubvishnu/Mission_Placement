import java.util.*;
public class pro54
{
   public static void secondsmallest(int[] arr1)
    {
        int temp,i,j;
     for( i=0;i<arr1.length;i++)
      {
        for( j=i+1;j<arr1.length;j++)
        {
           if(arr1[i]>arr1[j])
           {
              temp=arr1[i];
              arr1[i]=arr1[j];
              arr1[j]=temp;
           }
        }  
      }
      System.out.println(arr1[1]);
       
    }
    public static void main(String[] args)
    {
        int [] arr={23,12,56,93,30,84};
        secondsmallest(arr);

    }
}