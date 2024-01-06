import java.util.Scanner;
public class LossPercentage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double loss=((a-b)/a)*100;
        System.out.printf("%.2f",loss);
    }
}