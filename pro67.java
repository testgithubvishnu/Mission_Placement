import java.util.*;
class array_sorting
{
    void sort(int m,int[] a)
    {
        int i,j,temp;
        for(i=0;i<m;i++)
        {
            for(j=i+1;j<m;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;                }
            }
        }
    }
}

class max_scalar_product
{
   int sum=0;
     void product(int[]a,int[]b,int m,int n)
     {
    
         for(int i=0;i<m;i++)
         {
          sum=sum+(a[i]*b[i]);
         }
         System.out.println("maximum scalar product is: "+sum);
     }

}
public class pro67
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("enter size of first vector");
        int size1=sc.nextInt();
        int [] arr1=new int[size1];

         System.out.println("enter size of first vector");
        int size2=sc.nextInt();
        int [] arr2=new int[size2];

        System.out.println("enter the elements of first vector: ");
        for(i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the elements of second vector: ");
        for(i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        array_sorting obj= new array_sorting();
        obj.sort(size1,arr1);
        obj.sort(size2,arr2);

        max_scalar_product obj1=new max_scalar_product();
        obj1.product(arr1,arr2,size1,size2);

    }
}