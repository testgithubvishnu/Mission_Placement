import java.util.*;
public class number_pattern2
{
      static void print_pattern(int N)
      {
        int row,col,space;
        for(row=1;row<=2*N;row++)
        {
            int c=row>N? 2*N-row:row;
           for(space=0;space<N-c;space++)
            {
               System.out.print(" ");
            }

            for(col=c;col>=1;col--)
            {
               System.out.print(col);
            }

            for(col=2;col<=c;col++)
            {
               System.out.print(col);
            }
            System.out.println();
        }
      }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       int r;
       System.out.println("enter the number of rows");
       r=sc.nextInt();

       print_pattern(r);
    }
}