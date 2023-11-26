import java.util.*;
public class pro69
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();

        int [] arr=new int[size];
        int i, even_count=0,odd_count=0;

        System.out.println("Enter the elements of an array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();

        }
         for(i=0;i<size;i++)
         {
            if(arr[i]%2==0)
            {
                even_count++;
            }
            else{
                odd_count++;
            }
         }
         System.out.println("Even elements in given array are: "+even_count);
         System.out.println("Odd elements in given array are: "+odd_count);

    }
}