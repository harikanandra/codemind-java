import java.util.Scanner;
public class King
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int total=(a*5)+(b*7);
        System.out.printf("%d",total);
    }
}