import java.util.*;
public class pro87
{
     static void print_pattern(int N)
     {
        int row ,col;;
        for(row=0;row<2*N ;row++)
        {
            int totalColInRow=row>N ? 2*N-row :row;
            int totalSpace=N-totalColInRow;

            for(col=0;col<totalSpace;col++)
            {
                System.out.print(" ");
            }

            for(col=0;col<totalColInRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
     }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int N = sc.nextInt();
        print_pattern(N);
    }
}