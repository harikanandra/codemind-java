import java.util.Scanner;
public class Weeks{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        System.out.println((int)(d/365));
        int s=(d%365)/7;
        System.out.println(s);
    }
}