// find lcm of given numbers
   import java.util.*;
    public class pro26{
         public static void main(String [] args)
       {
     Scanner sc = new Scanner(System.in);
      System.out.println("enter any two numbers:");
     int a=sc.nextInt();
     int b=sc.nextInt();

       int i=a,j=b;
      while(a!=b)
       {
         if(a>b)
          a=a-b;
         else
         b=b-a;
        }
       int lcm=(i*j)/a;
      System.out.println("LCM of given number:"+lcm);
       
    }
}
// hcf= (n1*n2)/lcm