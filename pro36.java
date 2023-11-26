import java.util.*;
public class pro36
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of peoples");
        int num_people = sc.nextInt();

        int handshakes=(num_people*num_people-num_people)/2;
        System.out.println("Number of handshakes is:"+handshakes);
    }
}