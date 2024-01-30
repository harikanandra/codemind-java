import java.util.*;
public class Colours{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='G') System.out.println("Green");
        else if(a=='B') System.out.println("Blue");
        else if(a=='I') System.out.println("Indigo");
        else if(a=='V') System.out.println("Violet");
        else if(a=='Y') System.out.println("Yellow");
        else if(a=='O') System.out.println("Orange");
        else if(a=='R') System.out.println("Red");
        else System.out.println(-1);
    }
}