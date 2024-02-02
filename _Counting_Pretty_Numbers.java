import java.util.*;
public class Counting{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for(int j=a;j<=b;j++)
            {
                if(j<10 && j==2 || j==3 || j==9) c++;
                else if(j>10) 
                {
                    int k=j%10;
                    if(k==2||k==3||k==9)
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}