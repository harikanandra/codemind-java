import java.util.Scanner;
public class Salary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float sal=sc.nextFloat();
        float h=sc.nextFloat();
        float d=sc.nextFloat();
        float pf=sal*(float)(0.12);
        float gross=sal+h+d+pf;
        System.out.printf("%.2f
%.2f",pf,gross);
    }
}