import java.util.Scanner;
public class Concert
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(4*x>1000) System.out.println("NO");
        else System.out.println("YES");
    }
}