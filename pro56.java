import java.util.*;
public class pro56
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

        int min=arr[0];
        int max=arr[0];
        for(i=0;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            else{
                max=arr[i];
            }
        }
        System.out.println("Smallest element in an array is: "+min);   
         System.out.println("largest element in an array is: "+max);   
         }

}