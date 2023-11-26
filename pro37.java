import java.util.*;
public class pro37
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // let two fractions be: x1/y1 & x2/y2

        // numerators taking
        System.out.println("enter the numerator of first fraction ");
        double x1=sc.nextDouble();

          System.out.println("enter the numerator of second fraction ");
        double x2=sc.nextDouble();

         //denominator taking
         System.out.println("enter the  denominator of first fraction ");
        double y1=sc.nextDouble();

        System.out.println("enter the  denominator of second fraction ");
        double y2=sc.nextDouble();

        double A=y1*y2;
        double B=x1*y2+x2*y1;
        double frac_product=B/A;

        System.out.println("sum of fractions is: " +x1+ "/" +y1+"+"+x2+ "/" +y2);
        System.out.println(" "+B+"/"+A);
        
    }
}