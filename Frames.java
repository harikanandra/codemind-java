import java.util.Scanner;
public class WireFrame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int per=2*(a+b);
        System.out.printf("%d",per*c);
    }
}