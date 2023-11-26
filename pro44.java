// find the ASCII value given number
 import java.lang.*;
  import java.util.*;
  public class pro44{
     public  static void main(String [] args)
      {
          Scanner sc = new Scanner(System.in);
        System.out .println("enter charactor");
        char c= sc.next().charAt(0);
          
         int ascii=c;
        
        System.out.println("ASCII value of given charactor:"+ascii);
    }
}