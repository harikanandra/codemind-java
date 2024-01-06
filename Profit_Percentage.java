import java.util.Scanner;
public class King
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double profit=((b-a)/a)*100;
        System.out.printf("%.2f",profit);
    }
}