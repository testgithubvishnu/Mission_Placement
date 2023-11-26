//programme on constructor  
 class first {
      int length,breadth;
        first (int x,int y)
           {
          length=x;
          breadth=y;
           }
           int Area()
           {
           return(length*breadth);
           } 

        }
  public class constructor{
   public static void main(String[] args)
      {
      first obj = new first(12,10);
       int area = obj.Area();
       System.out.println("area of rectangle="+area);
     }

   }