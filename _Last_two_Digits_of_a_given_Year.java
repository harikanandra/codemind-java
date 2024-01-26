import java.util.Scanner;
public class Year
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=a%100;
        if(s>=10)
        System.out.printf("%d",s);
        else
        System.out.printf("0%d",s);
    }
}