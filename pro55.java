import java.util.*;
public class pro55
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int i;
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int [] arr=new int[size];

       System.out.println("enter the elements of an array");
        for( i=0;i<size;i++)
        
        {
          arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Smallest element in an array is: "+max);   
         }
}