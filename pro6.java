// find greatest of two numbers
    import java.util.*;
    public class pro6{
      public static void main(String [] args)
      {
           Scanner sc= new Scanner(System.in);
             int n1,n2;
       System.out.println("enter any two numbers");
        n1=sc.nextInt();
          n2=sc.nextInt();

        if(n1>n2)
       System.out.println(n1+" is greater than "+n2);
        else
         System.out.println(n2+" is greater than "+n1);

     }
 }