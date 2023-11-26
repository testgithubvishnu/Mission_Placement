
import  akshata.*; 

  public class seashore
{
     public static void main(String [] args)
    {
       int x=45;
       int y=30;
       operation obj = new operation();
        int sum = obj.addition(x,y);
        System.out.println("sum="+sum);

       int sub = obj.substraction(x,y);
        System.out.println("difference="+sub);

        int mult = obj.multiplication(x,y);
        System.out.println("product"+mult);
     
     
     
     }
}