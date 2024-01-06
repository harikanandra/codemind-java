import java.util.Scanner;
public class Score
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        System.out.printf("%.2f",(x*1000)/3600);
    }
}