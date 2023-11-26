//programme on floyd's triangle
    import java.util.*;
    public class pro89{
     public static void main(String [] args)
      {
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many rows you want");
        int num=input.nextInt();
        int i,j,k=1;
        for(i=0;i<num;i++) 
         {
           for(j=0;j<i;j++)
            {
              System.out.print(k+" ");
               k++;
            }
         System.out.println();
         }
    }
}