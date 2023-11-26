// programme on pattern
    import java.util.*;
     public class pattern5{
     public static void main(String [] args)
      {
        int i,j,k=1;
         int row,column;
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number of rows");
         row=sc.nextInt();

        System.out.println("enter the number of columns");
         column=sc.nextInt();

         for(i=0;i<row;i++)
          {
             for(j=0;j<column;j++)
              {
                if(i>=j)
                System.out.print(k);
                 else
                 System.out.print(" ");
               }
              k++;
            System.out.println();
           }
        }
   }
         
         