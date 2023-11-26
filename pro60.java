import java.util.*;
public class pro60
{
public static void main(String[] args)
{
    
        Scanner sc = new Scanner(System.in);
         int i,j;
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int [] arr=new int[size];

       System.out.println("enter the elements of an array");
        for( i=0;i<size;i++)
        
        {
          arr[i]=sc.nextInt();
        }

        for( i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
           int  min=arr[i];
            if(arr[i]>arr[j])
            {
                min=arr[j];
                arr[j]=arr[i];
                arr[i]=min;
                

            }
            }
        }
        System.out.println("Sorted array is :");
        {
            for(i=0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
        }
}
}