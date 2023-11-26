// binary to decimal conversion
import java.util.*;
import java.lang.Math;
public class pro28
{
    static int bi_to_deci(int num)
    {
        int dec=0;
        int powr=0;
        while(true)
        {
            if(num==0)
            {
        break;
            }
            else{
                int rem=num%10;
                dec+=rem*Math.pow(2,powr);
              
                num=num/10;
                  powr++;
            }
           
        }
         return dec;
    }

    public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter binary string");
    
     int str=sc.nextInt();
     System.out.println("Decimal conversion of binary string:");

     int dec1=bi_to_deci(str);
     System.out.println(dec1);
    }

}