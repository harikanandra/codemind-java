import java.util.*;
public class Steps{
    public static int Steps(int n)
        {
            int[] s=new int[n+1];
            s[1]=1;
            s[2]=2;
            for(int i=3;i<=n;i++)
            {
                s[i]=s[i-1]+s[i-2];
            }
            return s[n];
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println(Steps(n));
    }
}