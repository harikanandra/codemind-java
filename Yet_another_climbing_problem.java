import java.util.Scanner;
public class Steps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a%b==0) System.out.println(a/b);
            else
            {
                int c=a/b;
            System.out.println(c+(a%b));
            }
            t=t-1;
        }
    }
}