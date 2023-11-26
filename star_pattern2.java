import java.util.*;

public class star_pattern2
{
     static void pattern(int r)
{
    for(int i=0;i<r;i++)
   {
      for(int j=0;i+j<r;j++)
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