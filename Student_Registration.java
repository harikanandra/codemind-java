import java.util.Scanner;

public class Student{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        while (d --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((b-c)>=a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            // Decrement d to control the loop
        }

        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
