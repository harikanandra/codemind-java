import java.util.*;
public class Car{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        double x1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y1=sc.nextDouble();
        double y2=sc.nextDouble();
        if((x1/y1)>(x2/y2)) System.out.println(-1);
       else if((x1/y1)<(x2/y2)) System.out.println(1);
       else System.out.println(0);
        }
    }
}