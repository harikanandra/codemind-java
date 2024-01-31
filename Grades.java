import java.util.*;
public class Marks{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        double s=((a+b+c+d+e)/500.0)*(100.0);
        if(s>=90) System.out.println("Grade A");
        else if(s>=80 && s<90) System.out.println("Grade B");
        else if(s>=70 && s<80) System.out.println("Grade C");
        else if(s>=60 && s<70) System.out.println("Grade D");
        else if(s>=40 && s<60) System.out.println("Grade E");
        else if(s<40) System.out.println("Grade F");
        
        
    }
}