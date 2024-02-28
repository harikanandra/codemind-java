import java.util.*;
public class Maximum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='6')
            {
            a[i]='9';
            break;
            }
        }
        String a1=new String(a);
        int number=Integer.parseInt(a1);
        System.out.println(number);
    }
}