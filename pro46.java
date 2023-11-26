//Calculate the number of digits in an integer
import java.util.*;
public class pro46
{
    public static void main(String[] args)
    {
        int input,rem;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        input=sc.nextInt();
        System.out.println("Number of digits in given number are:");
        while(input!=0)
        {   
            rem=input%10; 
            count=count+1;
            input=input/10;
              
        }
        
        
        System.out.println(count);
        
            }
}