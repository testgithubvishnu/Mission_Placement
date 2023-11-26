public class inheritance{
    public static void main(String [] args)
{
    System.out.println("this is main class");
     first obj = new first();
      obj.display();
      obj.show();     

}
  }
   class first extends second{
      void display()
        {
     System.out.println("this class first");
       }
   }

    class second
   {
    void show()
     {
  System.out.println("this is class second");
    }

  }