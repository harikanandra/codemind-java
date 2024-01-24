import java.util.Scanner;
public class Divisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int z;
        z=Math.abs(a-b);
        if(z>=a || a==b)
        {
            System.out.println("YES");
        }
        else
        System.out.println("NO");
        T=T-1;
        }
    }
}