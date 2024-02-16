import java.util.*;
public class Count{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int c=0;
        for(char i:arr)
        {
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
            c++;
        }
        System.out.println(c);
    }
}