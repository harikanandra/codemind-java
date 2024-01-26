import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float s=(a+b+c)/2.0f;
        float per=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",per);
    }
}