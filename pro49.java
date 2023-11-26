
//Finding Number of times x digit occurs in a given input 

import java.util.*;
 public class pro49
 {
        static void num_freq(int n,int d)
        {
            int count=0;
            while(n!=0)
            {
                int rem=n%10;
                
                    if(rem==d)
                    {
                        count++;
                    }
                 n=n/10;   
            }
            System.out.println("Digit "+d+" present "+count+" times");
        }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       
    
         System.out.println("Enter the number :");
        int num= sc.nextInt();

         System.out.println("Enter the digit :");
        int x= sc.nextInt();

        num_freq(num,x);


        
    }
 }
