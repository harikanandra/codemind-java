import java.util.Scanner;
public class Traingle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.printf("%.2f",Math.sqrt((Math.pow(a,2)+Math.pow(b,2))));
    }
}