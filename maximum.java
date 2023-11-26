  import java.util.*;
  public class maximum
{
   public static void main(String [] args)
    {
       Scanner input = new Scanner(System.in);
      
       int [] arr=new int[6];
       int i;
 
       System.out.println("enter the numbers");
        for(i=0;i<6;i++)
         {
           arr[i]=input.nextInt();
         }
     
       int max=arr[0];
       for(i=0;i<6;i++)
        {
         if(arr[i]>max)
           {
            max=arr[i];
           }
        }
         System.out.println("maximum number is "+max);
     
     }          
  }