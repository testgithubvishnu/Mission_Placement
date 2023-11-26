// Using try ,catch & finally
      import java.util.*;
        public class exception_handling1{
         public static void main(String[] args)
            {
            
            
           try{
                  int[] arr={2,4,6};
                
                  System.out.println(arr[8]);
               }
                  catch(Exception e)
                  {
                  System.out.print("something went wrong");
                  }
                    finally
                     {
                      System.out.println("try and catch finished");
                      }
               }
      }