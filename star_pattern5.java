import java.util.*;

public class star_pattern5
{
    static void pattern(int r)
    {
         int i,j;
        for( i=0;i<r;i++)
       {
         for( j=0;j<=i;j++)
         {
         System.out.print("*");
         }
         System.out.println();
       }

      for( i=0;i<r;i++)
        {
         for( j=0;i+j<r;j++)
         {
         System.out.print("*");
         }
         System.out.println();
       }
    }

    static void pattern_trick(int r)
    {
        for(int i=0;i<2*r;i++)
        {
             int c=i>r ? 2*r-i:i;
            for(int j=0;j<c;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

public static void main(String[] args)
    {
        int row;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        row=sc.nextInt();
      pattern(row);
      pattern_trick(row);
         

    }
}