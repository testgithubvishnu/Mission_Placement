//programme on pattern
  import java.util.*;
  public class pattern4{
     public static void main(String [] args)
      {
        int i,j;
         char k='A';
        for(i=0;i<26;i++)
          {
            for(j=0;j<26;j++)
              {
                if(i>=j)
                 {
                 System.out.print(k);
                  
                 }
                 else
                  {
                 System.out.print(" ");
                  }
                }
             k++;
            System.out.println();
          }
      }
}
        
      