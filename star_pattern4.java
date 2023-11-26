import java.util.*;

public class star_pattern4
{
     static void pattern(int r)
{
       for(int i=1;i<=r;i++)
      {
         for(int j=1;j<=i;j++)
          {
           System.out.print(" ");
          }
         for(int k=r;k>=i;k--)
          {
           System.out.print("*");
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
    }
}