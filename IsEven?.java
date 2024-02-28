import java.util.*;
public class IsEven{
    public static int iseven(int n)
    {
        if(n%2==0||n==0)
        return 2;
        else
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(iseven(n));
    }
}