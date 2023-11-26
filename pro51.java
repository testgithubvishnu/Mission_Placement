// To find the roots of quadratic equation
   import java.util.*;
    import java.lang.Math;
   public class pro51{
      public static void main(String [] args)
      {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the coeffcient of x^2 term");
           a= sc.nextDouble();
          System.out.println("Enter the coeffcient of x term");
           b= sc.nextDouble();
           System.out.println("Enter the coeffcient constant term");
           c= sc.nextDouble();

           double D=b*b-4*a*c;
           
           if(D<0)
            {
             System.out.println("Roots are imaiginary and complex");
            }
            else if(D==0)
            {
             System.out.println("Roots are real and same");
            }
            else
            {
             System.out.println("Roots real and distinct");
              }
              double root1= ((-b+Math.pow(D,0.5))/(2*a));       
              double root2= ((-b-Math.pow(D,0.5))/(2*a));

              System.out.println("Roots of quadratic equation are: "+root1+" "+root2);    
            
       }
   }