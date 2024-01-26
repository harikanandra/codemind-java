import java.util.Scanner;
public class Temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        float f=32+((c*9)/5.0f);
        System.out.printf("%.2f",f);
    }
}