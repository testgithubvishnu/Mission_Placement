// programme on star pattern
// triangle
   import java.util.*;
    public class pattern2
{
    public static void main(String [] args)
    {
      Scanner sc= new Scanner(System.in);
       int row,column,i,j;
       System.out.println("enter the number of rows");
       row=sc.nextInt();
      
       System.out.println("enter the number of columns");
       column=sc.nextInt();
        
       for(i=0;i<row;i++)
        {
          for(j=0;j<column;j++)
            {  
                if(i==0||j==0||i==row-1||j==column-1)
                System.out.print("*");
                else
               System.out.print(" ");
            }
        System.out.println();
      }
  
    }
}
              




       

       