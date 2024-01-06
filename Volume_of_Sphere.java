import java.util.Scanner;
public class Square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        
        System.out.printf("%.2f",(4*3.14*(a*a*a))/3);
    }
}