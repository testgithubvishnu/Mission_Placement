// find the frequency of element in aaray
    import java.util.*;
    public class pro61{
       public static void main(String[] args)
          {
            Scanner sc= new Scanner(System.in);
              int size,i;
               int count=0;
             System.out.println("Enter the size of array:");
             size=sc.nextInt();
             int[] arr=new int[size];

              System.out.println("Enter the elements of array:");
             for(i=0;i<size;i++)
               {
                 arr[i]=sc.nextInt();
               }

                System.out.println("Enter the numbers you want to find:");
                  int num=sc.nextInt();

                for(i=0;i<size;i++)
                 {
                    if(arr[i]==num)
                       {
                      count++;
                        }
                    }
                      System.out.println("number "+num+" found at "+count+" times");
               }
      }