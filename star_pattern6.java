
import java.util.*;
public class star_pattern6
{
public static void main(String[] args)
    {
        int r,i,j,k;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        r=sc.nextInt();

         for( i=1;i<=r;i++)
   {
      for(j=r;j>=i;j--)
      {
         System.out.print(" ");
      }
      for(k=1;k<=i;k++)
      {
        System.out.print("*");
      }
      System.out.println();
   }

    for( i=1;i<=r;i++)
      {
         for( j=1;j<=i;j++)
          {
           System.out.print(" ");
          }
         for( k=r;k>=i;k--)
          {
           System.out.print("*");
          }
          System.out.println();
   }
    }
}