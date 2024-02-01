import java.util.*;
public class Sum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=a%10;
        int n=a;
        while(a>10)
        {
            a/=10;
        }
        System.out.print(s+a);
    }
}