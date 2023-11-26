// programme on star pattern
// triangle
   import java.util.*;
    public class pattern1
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
                if(i<j)
                System.out.print(" ");5
                else
               System.out.print("*");
            }
        System.out.println();
      }
  
    }
}
              




       

       