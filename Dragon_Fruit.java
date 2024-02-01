import java.util.Scanner;
public class Dragon{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i%2==0 && j%2==0 && (i+j)==n)
                c++;
            }
        }
        if(c==0)
        System.out.println("NO");
        else
        System.out.println("YES");
    }
}