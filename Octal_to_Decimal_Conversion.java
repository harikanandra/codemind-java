import java.util.Scanner;
public class Octal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int n=Integer.parseInt(a, 8);
        System.out.println(n);
    }
}
