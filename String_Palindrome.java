import java.util.*;

public class Strings{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] arr=s1.toCharArray();
        char[] arr1=new char[arr.length];
        int j=arr.length;
        for(char i:arr)
        {
            arr1[j-1]=i;
            j--;
        }
        String a=new String(arr);
        String b=new String(arr1);
        if(a.compareTo(b)==0) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
