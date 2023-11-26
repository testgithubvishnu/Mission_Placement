import java.util.*;
public class pro91
{
    public static void main(String[] args)
    {
        int [] arr1=new int [] {2,4,6,8,1};
        int [] arr2= new int[] {2,4,6,8,1};

        if(arr1==arr2)
        {
            System.out.println("Arrays are similar");
        }
        else
        {
            System.out.println("Arrays are not similar");
        }

        if(arr1.equals(arr2))
        {
            System.out.println("Arrays are similar");
        }
        else
        {
            System.out.println("Arrays are not similar");
        }
        
    
    }
}

// arr1 and arr2 are two differnet references of objects