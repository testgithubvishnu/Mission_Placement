//calculate area of circle
  import java.util.*;
  public class pro43{
  
   public static void main(String [] args)
   {
    final double pi=3.14;
    Scanner sc= new Scanner(System.in);
     System.out.println("enter the radius of circle");
      double radius =sc.nextDouble();
      double area=pi*radius*radius;

   System.out.println("area of circle is:"+area);
  }
}