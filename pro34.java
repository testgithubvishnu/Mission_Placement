// Quadrant in which given coordinate lies
    import java.util.*;
    public class pro34{
       public static void main(String[] args)
        {
          Scanner sc = new Scanner (System.in);
           int c1,c2;
            System.out.println("Enter the quadrant in which coordinate lies:");
           c1=sc.nextInt();
           c2=sc.nextInt();
         
          if(c1<0 && c2<0)
           {
             System.out.println("coordinate lies in fourth quadrant");
          }
     
          else if(c1>0 && c2>0)
           {
             System.out.println("coordinate lies in first quadrant");
          }
           else if(c1<0 && c1>0)
           {
             System.out.println("coordinate lies in second quadrant");
          }
           else 
           {
             System.out.println("coordinate lies in fourth quadrant");
          }
     }
}