// programe to convert from decimal to binary conversion
   import java.util.*;
     public class pro30{

      static void dec_to_bin(int x)
      {
         int[] bin= new int[25];
         int index=0;
        while(x!=0)
        {
         int rem= x%2;
         bin[index++]=rem;
         x=x/2;

        }
        for(int j=index-1;j>=0;j--)
        {
         System.out.print(bin[j]);
        }
      }

      public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Read any number:");
       int num = sc.nextInt();
        dec_to_bin(num);

       
    }

  }