import java.util.*;
public class IsOdd{
    public static int isodd(int n)
    {
        if(n%2!=0)
        return 2;
        else if(n==0)
        return 1;
        else
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isodd(n));
    }
}