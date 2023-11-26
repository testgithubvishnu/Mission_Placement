//programme on friendly pair

  import java.util.*;
   public class pro24{
   
      public static void main(String[] arg)
 {
       Scanner input = new Scanner(System.in);

       System.out.println("enter first number");
        int n1=input.nextInt(); 
        System.out.println("enter second number");
        int n2=input.nextInt();
 
       int rem,sum1=0,sum2=0;
        for(int i=1;i<n1;i++)
         {
            if(n1%i==0)
             {
              sum1=sum1+i;
            }
         } 
    

       for(int j=1;j<n2;j++)
         {
            if(n2%j==0)
             {
              sum2=sum2+j;
            }
         } 

        float R1=(sum1/n1);
        float R2=(sum2/n2); 

         if(R1==R2)
          {
          System.out.println("given numbers are friendly pair");
           }
          else
            {
           System.out.println("given numbers are not friendly pair");
             }
              
     }
}


  