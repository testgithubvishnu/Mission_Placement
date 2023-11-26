import java.util.*;
class exmaple
{
void count(String str2)
{
    int vowels=0,consonants=0;
    str2=str2.toUpperCase();
    for(int i=0;i<str2.length();i++)
    {
        char ch=str2.charAt(i);
        if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
        {
            vowels++;
        }
        else{
            consonants++;
        }
    }
    System.out.println("number of vowels is :"+vowels);
     System.out.println("number of consonants is :"+consonants);
}
}
public class pro96
{
    public static void main(String[] args)
    {
        exmaple obj = new exmaple();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        obj.count(str);

    }
}