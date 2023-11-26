import java.util.*;
class disjoin_or_not
{
    int i,j;
    void decision(int m,int n,int[] ar1,int [] ar2)
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(ar1[i]==ar2[j])
                {
                    System.out.println("Given two arrays are not disjoined");
                    

                }
                
            }
        }
       
                    
                
         
    }
}
public class pro72
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an first array:");
        int size1=sc.nextInt();

         System.out.println("Enter the size of an second array:");
        int size2=sc.nextInt();
         int i;

        int [] arr1=new int[size1];
        int [] arr2=new int[size2];
       
        System.out.println("Enter the elements of first array:");
        for(i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of second array:");
        for(i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        disjoin_or_not obj =new disjoin_or_not();
        obj.decision(size1,size2,arr1,arr2);




    }
}