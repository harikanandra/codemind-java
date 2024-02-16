import java.util.*;
public class Strings{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int c=1;
        for(char i:arr)
        {
            if(i==' ') c++;
        }
        System.out.println(c);
    }
}