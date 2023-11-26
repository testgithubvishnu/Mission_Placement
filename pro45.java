// to find the prime number between 1 to 100
     import java.util.*;
        public class pro45{
         public static void main(String[] args)
         {
           int i,count=0;
          for(i=1;i<100;i++)
            {
              for(int j=1;j<=i;j++)
                 {
                   if(i%j==0)
                    {
                    count++;
                    }
               }
                 if(count==2)
                  System.out.print(i);
                 
            }
          }
         }        