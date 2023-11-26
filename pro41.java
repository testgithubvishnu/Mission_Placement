import java.util.*;

class pro41{
    public static void main(String[] args)
    {
         
        Scanner sc = new Scanner(System.in);
        System.out .println("enter charactor");
        char c= sc.next().charAt(0);
       
        switch(c)
       {
          case 'a':
         case 'e':
         case 'i':
          case 'o':
          case 'u':
         case 'A':
          case 'E':
          case 'I':
         case 'O':
         case 'U':
                   System.out.println("given charactor is vowel");
          break;
          
         default:
                  System.out.println("given charactor is consonant");
             
       }  

    }
}