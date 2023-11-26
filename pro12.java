// Reverse of given number
      import java.util.*;

     public class pro12{
      public static void main(String[] args)

      {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num = sc.nextInt();
        int sum=0,rem;
        
         
        while(num!=0)
        {
            rem = num%10;
            sum= sum*10+rem;
            num=num/10;
       }
         System.out.println("Reverse of number:"+sum);
   }
}
             