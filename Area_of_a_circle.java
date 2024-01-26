import java.util.Scanner;
public class Radius
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        float f=(float)3.14*c*c;
        System.out.printf("%.2f",f);
    }
}